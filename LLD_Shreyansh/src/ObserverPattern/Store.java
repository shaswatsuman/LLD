package src.ObserverPattern;

import src.ObserverPattern.Observable.IphoneObervableImpl;
import src.ObserverPattern.Observable.StocksObservable;
import src.ObserverPattern.Observer.EmailAlertObserverImpl;
import src.ObserverPattern.Observer.MobileAlertObserverImpl;
import src.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String args[]) {

        StocksObservable iphoneStockObservable = new IphoneObervableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
    }
}
