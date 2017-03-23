package com.puli.service;

import com.puli.entity.Probability;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/3/23.
 */
public interface ProbabilityService extends JpaRepository<Probability,Integer> {
}
