package pursuit.forum.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

@Service
public class StatisticService implements IStatisticService {

	static AtomicInteger hitCount = new AtomicInteger(0);

	@Override
	public void hitAPI() {
		System.out.println(hitCount.incrementAndGet());
	}
}
