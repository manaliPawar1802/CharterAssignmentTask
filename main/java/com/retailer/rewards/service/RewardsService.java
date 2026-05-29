package com.retailer.rewards.service;

import com.retailer.rewards.model.Rewards;

/**
 *  RewardsService
 */
public interface RewardsService {

    /**
     * @param customerId
     * @return
     */
     Rewards getRewardsByCustomerId(Long customerId);

}
