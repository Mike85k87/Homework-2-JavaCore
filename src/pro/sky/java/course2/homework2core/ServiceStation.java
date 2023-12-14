package pro.sky.java.course2.homework2core;

public class ServiceStation implements StationOfService {
    @Override
    public void check(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.service();
    }
}
