package com.company.sys.controller;

import com.company.sys.controller.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class RouterHotel {


    private ReservationSystemService reservationSystemService;


    private BillingSystemService billingSystemService;


    private AccessControlSystemService accessControlSystemService;


    private FinancialSystemService financialSystemService;


    private OTAPlatformService otaPlatformService;

    // 接收预订信息并更新客房库存
    @PostMapping("/reservation")
    public ResponseEntity<String> receiveReservation(@RequestBody ReservationSystemService  reservationSystemService) {
        // 处理预订信息逻辑
        reservationSystemService.processReservation(reservationSystemService);
        return ResponseEntity.ok("Reservation received and processed");
    }

    // 结算信息、账单生成、支付信息
    @PostMapping("/billing")
    public ResponseEntity<String> handleBilling(@RequestBody BillingSystemService billingSystemService) {
        // 处理结算信息逻辑
        billingSystemService.processBilling(billingSystemService);
        return ResponseEntity.ok("Billing information processed");
    }

    // 客人入住信息同步、房卡授权
    @PostMapping("/access-control")
    public ResponseEntity<String> syncAccessControl(@RequestBody AccessControlSystemService accessControlSystemService) {
        // 处理门禁系统信息逻辑
        accessControlSystemService.syncAccessInfo(accessControlSystemService);
        return ResponseEntity.ok("Access control information synchronized");
    }

    // 账务信息、财务报表
    @PostMapping("/financial")
    public ResponseEntity<String> handleFinancialData(@RequestBody FinancialSystemService financialSystemService) {
        // 处理财务信息逻辑
        financialSystemService.processFinancialData(financialSystemService);
        return ResponseEntity.ok("Financial information processed");
    }

    // 房态信息同步、价格更新、订单处理
    @PostMapping("/ota-platform")
    public ResponseEntity<String> syncWithOTAPlatform(@RequestBody OTAPlatformService otaPlatformService) {
        // 处理与OTA平台的信息逻辑
        otaPlatformService.syncWithOTA(otaPlatformService);
        return ResponseEntity.ok("Synced with OTA platform");
    }
}
