package EcoPick.controller.coupon;

import EcoPick.domain.coupon.dto.MemberCouponInfoDto;
import EcoPick.service.coupon.CouponQueryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/coupons")
public class CouponQueryController {

    private CouponQueryServiceImpl couponQueryService;

    @GetMapping("/info/{memberId}")
    public ResponseEntity<?> getMemberCouponsInfo(@PathVariable()Long memberId) {
        List<MemberCouponInfoDto> memberCouponsInfo = couponQueryService.getMemberCouponsInfo(memberId);
        return ResponseEntity.ok(memberCouponsInfo);
    }
}
