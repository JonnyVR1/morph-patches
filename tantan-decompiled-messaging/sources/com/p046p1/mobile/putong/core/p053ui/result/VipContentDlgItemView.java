package com.p046p1.mobile.putong.core.p053ui.result;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import java.util.Locale;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VRelative;
import p147v.VText;
import p149l.d3c0;
import p149l.e30;
import p149l.fy80;
import p149l.hgl0;
import p149l.hmb;
import p149l.i0g0;
import p149l.mkd0;
import p149l.nu0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.wx80;
import p149l.xdl0;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class VipContentDlgItemView extends VLinear {

    /* JADX INFO: renamed from: A */
    public static final int f35652A = t100.m186890d(hmb.m131708m1() * 210.0f);

    /* JADX INFO: renamed from: B */
    public static final int f35653B = t100.m186890d(hmb.m131708m1() * 280.0f);

    /* JADX INFO: renamed from: C */
    public static final int f35654C = t100.m186890d(hmb.m131708m1() * 15.0f);

    /* JADX INFO: renamed from: c */
    public VText f35655c;

    /* JADX INFO: renamed from: d */
    public VText f35656d;

    /* JADX INFO: renamed from: e */
    public VFrame f35657e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f35658f;

    /* JADX INFO: renamed from: g */
    public VRelative f35659g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f35660h;

    /* JADX INFO: renamed from: i */
    public VLinear_FillerMeasure f35661i;

    /* JADX INFO: renamed from: j */
    public VText f35662j;

    /* JADX INFO: renamed from: k */
    public VImage f35663k;

    /* JADX INFO: renamed from: l */
    public View f35664l;

    /* JADX INFO: renamed from: m */
    public View f35665m;

    /* JADX INFO: renamed from: n */
    public VFrame f35666n;

    /* JADX INFO: renamed from: o */
    public VFrame f35667o;

    /* JADX INFO: renamed from: p */
    public AutoVDraweeView f35668p;

    /* JADX INFO: renamed from: q */
    public VLinear f35669q;

    /* JADX INFO: renamed from: r */
    public VImage f35670r;

    /* JADX INFO: renamed from: s */
    public VFrame f35671s;

    /* JADX INFO: renamed from: t */
    public VText f35672t;

    /* JADX INFO: renamed from: u */
    public RoamedLocationData f35673u;

    /* JADX INFO: renamed from: v */
    public PurchaseType f35674v;

    /* JADX INFO: renamed from: w */
    public C8839a.f f35675w;

    /* JADX INFO: renamed from: x */
    public PutongFrag f35676x;

    /* JADX INFO: renamed from: y */
    public Privilege f35677y;

    /* JADX INFO: renamed from: z */
    public Act f35678z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContentDlgItemView$a */
    public class C8836a extends ClickableSpan {
        public C8836a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zvf0.m220396r("e_vip_privilege_badge_optional_button", "p_privilege_intro");
            CoreModule.m29932K().mo30688Fo(VipContentDlgItemView.this.f35676x.getActivity());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-11908534);
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContentDlgItemView$b */
    public static /* synthetic */ class C8837b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35680a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35680a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35680a[Privilege.svip_badge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35680a[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35680a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35680a[Privilege.vip_unlimited_likes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35680a[Privilege.intl_no_ad.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35680a[Privilege.vip_location.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35680a[Privilege.message_read_state.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35680a[Privilege.advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35680a[Privilege.letter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35680a[Privilege.privacy_membership.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35680a[Privilege.recover_unmatches.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35680a[Privilege.see_who_likes_me.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35680a[Privilege.online_match_tickets.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35680a[Privilege.boost.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35680a[Privilege.liked_user.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35680a[Privilege.see_theme_unlock_more.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35680a[Privilege.see_theme_unlock_online.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35680a[Privilege.see_theme_unlock_pop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35680a[Privilege.vip_letter_gp.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35680a[Privilege.see_letter_gp.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public VipContentDlgItemView(@NonNull Context context) {
        super(context);
        this.f35673u = RoamedLocationData.new_();
    }

    private String getPrivacyMembershipImageUrl() {
        String strM133885y = i0g0.m133885y();
        if ("ko-KR".equals(strM133885y)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IlJZVDRQV040RE1XS0pWSUZWNU1GWFFOWE82RlZRTjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MjUzNTUwMzU3MTA3NjMsImFiIjowfQ.png";
        }
        if ("ja-JP".equals(strM133885y)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IkZTN1JIRkdPNVJOWVlQRFJaS1FVRkVLR0xNU0tQSDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MjU0MjM3NTM2MjI4OTF9.png";
        }
        if ("id-ID".equals(strM133885y)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IlNKNFNEUVNDVkRPQlVKNE1BVlc2Nk03NDdaNllBVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM0OTAxMDIyMTM2Mzg0OTF9.png";
        }
        if ("zh-TW".equals(strM133885y)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IjUyVzY3V1lYRDdETFMyVVI1UlVLRVBJSzJGRkRDTjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDQ2OTk3MDgyNTYwODE5LCJhYiI6MH0.png";
        }
        return "zh-CN".equals(strM133885y) ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkxGWE80U0ZGTEQ3UlJTQzJRTjdFNTZWMkw1RU1DVzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDQ2OTk3MDgyNTYwODE5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc2SkVBMk9DSzYyNEpGM1hENVg3R1pKS0dSTE5YTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDQ2ODI1MjgxNzgwMDU5LCJhYiI6MH0.png";
    }

    private String getSVIPAdvancedFilterImageUrl() {
        return "en".equals(Locale.getDefault().getLanguage()) ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkROUVpTNkNUMkkzSTI3U1M3VEpNQ0tOVUlGS0pWVTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MDc5MDAyODg4ODMwMTksImFiIjowfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlJPQTVQRlU1VUpEUjdZREVCRkRWWEpXSDRWNENWNDA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MDc3NjI1ODA5Njk3ODMsImFiIjowfQ.png";
    }

    /* JADX INFO: renamed from: s0 */
    private String m54826s0(@StringRes int i) {
        return getContext().getString(i);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m54827A0(RoamedLocationData roamedLocationData) {
        this.f35673u = roamedLocationData;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m54828B0(View view) {
        CoreModule.m29935P().m94651a().mo33393Q8(this.f35678z, this.f35673u);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m54829D0(User user) {
        m54868q1(m54867q0(zz6.m221004u0()));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m54830E0(User user) {
        m54868q1(getPrivacyMembershipImageUrl());
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m54831G0(User user) {
        String str;
        boolean zM221004u0 = zz6.m221004u0();
        if ("en".equals(Locale.getDefault().getLanguage())) {
            str = zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJKUUlWWjQ0V1NQWDY2TkZDSTQ3WU9ORFpBVFFRWDA4IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY2NjA4NjI3MTc5MTUzMTk5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkM3SVBIT1BJMk9ESENZVkNUQ0dTUFNHSFBXNzdOMzA4IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY4ODYwNDI2NzU4MDg3OTgzfQ.png";
        } else {
            str = zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkRaQkJHVUwyS0lUQjRMWkxBU1VQQjZRVEtXWkhQUjA5IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY2NjA4NjI3MTc5MTUyMTcxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjM3WjZCWU9aTE5XUU9ZVkpGVUZFSDQ3U0lEVDVUTjA4IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY4ODYwNDI2NzU4MDg3OTc5fQ.png";
        }
        m54868q1(str);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m54832H0(User user) {
        m54868q1(zz6.m221004u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2NlNDNExPTUxXVEtQSDRMWEtORTNLUUtPMk4yTzA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY2NjA4NjI2OTEwNzE2NzE1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9WUjZENENISzZVRUszTFBPQjM0SURQRUJPV01SQzA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY4ODYwNDI2NzU3OTU2OTA3LCJhYiI6MH0.png");
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m54833I0(User user) {
        String str;
        boolean zM221004u0 = zz6.m221004u0();
        if ("en".equals(Locale.getDefault().getLanguage())) {
            str = zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJSQzRQSlpQM0tFVlI2V0I1NkdJVkFHSUNCNFZVTTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc4NjYzNzQzNzMwNTc1NjYzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkJWSFNDNUpOSlk1WlJWWjdHUk1NQU9HQkQ0UkxRMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc2OTc0ODg1MjgwMzc3MTM1LCJhYiI6MH0.png";
        } else {
            str = zM221004u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlI2REdFS0hNRkpERFVSWktYVVJOU0lYSks3QUxVNjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc4NjYzNzQzNzMwNTc1NjU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkcyVFBSRlpGRk9YT0ZTWlY0WDNaRkZZTFZMMkJUUTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc2OTc0ODg1MjgwMzc3MTMxLCJhYiI6MH0.png";
        }
        m54868q1(str);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m54834J0(User user) {
        m54868q1(zz6.m221004u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IllOWUhVQUdYSk41VUxYWU5RVDNYWlJEUk5RN1FIUTA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc4NjYzNzQzNzMwNTc1NjU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlpDUUlMN1VUSTVZQVdHVTVPU1dKMzZDUVNIWjZHRCIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzY3Njk3NDg4NTI4MDM3NzEzMSwiYWIiOjB9.png");
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m54835K0(User user) {
        m54868q1(m54869r0(zz6.m221004u0()));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m54836L0(User user) {
        m54868q1(CoreModule.m29935P().m94651a().mo33397R6());
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m54837M0(User user) {
        m54868q1(CoreModule.m29935P().m94651a().mo33491eg() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ3SDNFUUxLVjY3TzdaWTdDRUFWRFc1RTVGSk1SRjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNTQ2MDM0ODAwMTYwNDk5MDYxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IllWQlZETk1LUFpZQVBXQTRaWElDRFdKMkhFUVVNVDA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMzk4MzQ1NjA4NDExMTc1NzgxfQ.png");
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m54838N0(User user) {
        m54868q1(CoreModule.m29935P().m94651a().mo33491eg() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjRXRUtZWVg2VFhZREdQWUNRUzVGV09IREc2UlRBWjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzQwMzkxNjYzNTY0MzAzMTg5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjNaTUtQQU83SVdLVkpVVFVBTTdXQkRDSkhENVJGSjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MTU1MTAyNDY4MDY0MzUzMTQxfQ.png");
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m54839O0(User user) {
        m54868q1(CoreModule.m29935P().m94651a().mo33491eg() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjYyWVFKR0tFVExSSjVYUUNRSFYzSFlBRjJBSENCSDA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozODM0MDk5NjE1NDY2NTk3MjAxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFXMlZXSU5XQk5EMzNTUU1QNVg2NTdNNEdSU1BNMjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzk0ODExMTk5NDA0OTc2OTczfQ.png");
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m54840P0(User user) {
        this.f35671s.setBackgroundResource(user.isFemale() ? d3c0.f84178y0 : d3c0.f84164x0);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m54841Q0(User user) {
        qib0.f154691G.m102314D(this.f35671s, user.isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFaQ0dEMklOWFk2TFo1VFA0SkJCWklGREVGR1Y1WTE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTI3NjYyMTYwNTc0Mzg0MDIxNH0.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlhJUlZFVzVKVVdBTVBPUkwzTjZZUFRVSTZLSlE1NDE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzgzNjQ5NTUwNDEzODM5OTIxMH0.webp");
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m54842R0(User user) {
        qib0.f154691G.m102314D(this.f35671s, zz6.m221004u0() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkZXUDVQR1VDRzdBQkxTTUFKNkFRVksyQ1YzN1lCTDE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDEyMzY4MTg4MDY4OTE5MTM1Mn0.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ikc3SDZYQVQzSlFOR09PWElBWDZGM1BaVEVZU1NNNTE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxODE1ODkxNTUyNDMyNzQ1MzE2MH0.webp");
    }

    /* JADX INFO: renamed from: S0 */
    public final void m54843S0() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.advanced_filter);
        this.f35655c.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : "高级筛选");
        m54868q1(CoreModule.m29935P().m94651a().mo33507h5() ? getSVIPAdvancedFilterImageUrl() : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFXUEVJNVFYSUhHREUyS1FXV0Y3NDYyQ0ZPNlZSRDA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MDc3NjI1ODA5Njc3MTksImFiIjowfQ.png");
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText = this.f35672t;
        if (zMo33507h5) {
            vText.setText(wx80VarM123716l.m205948d());
        } else {
            vText.setText("更多筛选条件\n遇见相似的人");
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m54844T0(Privilege privilege) {
        xdl0.m208344M(this.f35659g, true);
        Privilege privilege2 = Privilege.vip_badge;
        wx80 wx80VarM123716l = fy80.m123716l(privilege2);
        this.f35655c.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : m54826s0(R$string.f27386a9));
        if (CoreModule.m29935P().m94651a().mo33507h5() && privilege == privilege2) {
            this.f35657e.setBackgroundResource(d3c0.f83566F8);
        } else {
            this.f35657e.setBackgroundResource(d3c0.f83911f);
        }
        this.f35659g.setBackgroundResource(d3c0.f83925g);
        this.f35663k.setImageDrawable(nu0.m161424b(getContext(), privilege == Privilege.svip_badge ? d3c0.f83826Ya : CoreModule.m29935P().m94654e().mo34979cc()));
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.sfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164304a.m54871u0((User) obj);
            }
        }));
        String strM54826s0 = m54826s0(R$string.f27677z9);
        String strM54826s1 = m54826s0(R$string.f27472i);
        StringBuffer stringBuffer = new StringBuffer(strM54826s0);
        stringBuffer.append(" (");
        stringBuffer.append(strM54826s1);
        stringBuffer.append(')');
        String string = stringBuffer.toString();
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C8836a(), strM54826s0.length() + 1, string.length() - 1, 18);
        this.f35672t.setLines(4);
        this.f35672t.setText(spannableString);
        this.f35672t.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: U0 */
    public final void m54845U0() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.boost);
        this.f35655c.setText(wx80VarM123716l.m205968t());
        final boolean zM221004u0 = zz6.m221004u0();
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.xfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192693a.m54872v0(zM221004u0, (User) obj);
            }
        }));
        this.f35672t.setText(wx80VarM123716l.m205948d());
    }

    /* JADX INFO: renamed from: V0 */
    public final void m54846V0() {
        wx80 wx80VarM123716l = fy80.m123716l(this.f35677y);
        this.f35655c.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : m54826s0(R$string.f27597s6));
        this.f35657e.setBackgroundResource(d3c0.f83751T0);
        qib0.f154691G.m102314D(this.f35671s, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjJRRFJNU1YzVk1MVzNMNDJSSkNKUzVXNE5TRExRWTE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTI5NDUzNDc5MzU0OTI3MzgzMn0.webp");
        xdl0.m208344M(this.f35671s, true);
        this.f35672t.setText(wx80VarM123716l != null ? wx80VarM123716l.m205948d() : m54826s0(R$string.f27586r6));
    }

    /* JADX INFO: renamed from: W0 */
    public final void m54847W0() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.letter);
        this.f35655c.setText(wx80VarM123716l.m205968t());
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.ggl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102520a.m54873w0((User) obj);
            }
        }));
        this.f35672t.setText(wx80VarM123716l.m205948d());
    }

    /* JADX INFO: renamed from: X0 */
    public final void m54848X0() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.vip_letter_gp);
        this.f35655c.setText(wx80VarM123716l.m205968t());
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.lfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127903a.m54874x0((User) obj);
            }
        }));
        this.f35672t.setText(wx80VarM123716l.m205948d());
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m54849Y0() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.liked_user);
        this.f35655c.setText(wx80VarM123716l.m205968t());
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.nfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138803a.m54875y0((User) obj);
            }
        }));
        this.f35672t.setText(wx80VarM123716l.m205948d());
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m54850Z0() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.vip_location);
        this.f35655c.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : m54826s0(R$string.f27352X8));
        xdl0.m208344M(this.f35666n, true);
        this.f35657e.setBackgroundResource(d3c0.f83939h);
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.cgl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80781a.m54876z0((User) obj);
            }
        }));
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText = this.f35672t;
        if (zMo33507h5) {
            vText.setText(wx80VarM123716l.m205948d());
        } else {
            vText.setText(R$string.f27556p);
        }
        if (CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            xdl0.m208360X(this.f35657e, t100.m186890d(6.0f));
            xdl0.m208344M(this.f35656d, true);
            this.f35656d.setText(m54826s0(R$string.f27286R8) + " >");
            this.f35678z.duringCreated(CoreModule.f17545c.f19657k0.f20088R.m121230k()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.dgl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86114a.m54827A0((RoamedLocationData) obj);
                }
            }));
            this.f35656d.setOnClickListener(new View.OnClickListener() { // from class: l.egl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f90960a.m54828B0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m54851a1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.message_read_state);
        this.f35655c.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : "查看消息已读状态");
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.ufl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176273a.m54829D0((User) obj);
            }
        }));
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText = this.f35672t;
        if (zMo33507h5) {
            vText.setText(wx80VarM123716l.m205948d());
        } else {
            vText.setText("显示对方是否看过你的消息\n不再被动苦苦等待");
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m54852d1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.privacy_membership);
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText = this.f35655c;
        if (zMo33507h5) {
            vText.setText(wx80VarM123716l.m205968t());
            this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.fgl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f97384a.m54830E0((User) obj);
                }
            }));
            this.f35672t.setText(wx80VarM123716l.m205948d());
        } else {
            vText.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : "隐私特权");
            m54868q1(CoreModule.m29935P().m94651a().mo33507h5() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlUySERRN1hCRklOWVJQRE1HMjI1Wk03VVFBWU1aSTA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDI5MjY3MDU0OTA5NzM5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlNTM05HS0QzU1oyTTVLSFRZNENEU0ZYN0ZSWTZTMzA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDI5MjY3MDU0OTA1NjM1LCJhYiI6MH0.png");
            this.f35672t.setText("只对我喜欢的人可见\n隐藏会员身份等");
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m54853e1() {
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText = this.f35655c;
        if (!zMo33507h5) {
            vText.setText("在线闪聊");
            this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.rfl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159163a.m54832H0((User) obj);
                }
            }));
            this.f35672t.setText("立刻获得神秘配对\n实时互动畅聊无阻！");
        } else {
            vText.setText(CoreModule.m29935P().m94651a().mo33473bk());
            this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.qfl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f154141a.m54831G0((User) obj);
                }
            }));
            this.f35672t.setText(String.format(CoreModule.m29935P().m94651a().mo33341Il(), CoreModule.m29935P().m94651a().mo33347Jj()));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m54854f1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.recover_unmatches);
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText = this.f35655c;
        if (zMo33507h5) {
            vText.setText(wx80VarM123716l.m205968t());
            this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.zfl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f202960a.m54833I0((User) obj);
                }
            }));
            this.f35672t.setText(wx80VarM123716l.m205965q());
        } else {
            vText.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : "找回解除的配对");
            this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.agl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f69381a.m54834J0((User) obj);
                }
            }));
            this.f35672t.setText(wx80VarM123716l != null ? wx80VarM123716l.m205965q() : "不错过每一次缘分");
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m54855g1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.see_who_likes_me);
        this.f35655c.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : getResources().getString(R$string.f27240N6));
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.vfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181284a.m54835K0((User) obj);
            }
        }));
        this.f35672t.setText(R$string.f27207K6);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m54856h1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.see_letter_gp);
        this.f35655c.setText(wx80VarM123716l.m205968t());
        this.f35672t.setText(wx80VarM123716l.m205948d());
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.wfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186092a.m54836L0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public final void m54857j1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.see_theme_unlock_more);
        this.f35655c.setText(wx80VarM123716l.m205968t());
        this.f35672t.setText(wx80VarM123716l.m205948d());
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.yfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198076a.m54837M0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k1 */
    public final void m54858k1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.see_theme_unlock_online);
        this.f35655c.setText(wx80VarM123716l.m205968t());
        this.f35672t.setText(wx80VarM123716l.m205948d());
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.bgl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75465a.m54838N0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l1 */
    public final void m54859l1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.see_theme_unlock_pop);
        this.f35655c.setText(wx80VarM123716l.m205968t());
        this.f35672t.setText(wx80VarM123716l.m205948d());
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.tfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170002a.m54839O0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m54860m1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.vip_super_like);
        boolean zMo33734Oi = ura.m195053e().m195057d().mo33734Oi();
        VText vText = this.f35655c;
        if (zMo33734Oi) {
            vText.setText(wx80VarM123716l.m205968t());
        } else {
            vText.setText(getContext().getString(R$string.f27398b9, 5));
        }
        xdl0.m208344M(this.f35671s, true);
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.ofl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143716a.m54840P0((User) obj);
            }
        }));
        this.f35657e.setBackgroundResource(d3c0.f83953i);
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText2 = this.f35672t;
        if (zMo33507h5) {
            vText2.setText(wx80VarM123716l.m205948d());
        } else {
            vText2.setText(R$string.f27451g2);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m54861n0(View view) {
        hgl0.m130834a(this, view);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m54862n1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.vip_undo);
        this.f35655c.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : m54826s0(R$string.f27374Z8));
        this.f35657e.setBackgroundResource(d3c0.f83967j);
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.pfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148573a.m54841Q0((User) obj);
            }
        }));
        xdl0.m208344M(this.f35671s, true);
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText = this.f35672t;
        if (zMo33507h5) {
            vText.setText(wx80VarM123716l.m205948d());
        } else {
            vText.setText(R$string.f27219L7);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final String m54863o0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IllSS1hPN1VJNTdYNVJLNTRWN09GTzVTWUZBWEZUNjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk1OTUxODY0ODQ5MjA1fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkpZWkdENEFWQkNYRUFBSzVXNFhEM1A3NkJHTFhNNjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        String strM133885y = i0g0.m133885y();
        if ("ko-KR".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjVYU0xMVEpKSFhaSzRBS1A2SDNBT0daSFg1VFMyVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjJWQkJaVEJLWjY0NVlCUkpBNUpWN1ZDUDdDSUxJSjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IklEN0wzWUg1MkZCNVpaMjRIT0VDVlFDUTdHRVpKVTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEQUY3UVVQUE1FWlMyTkZIVFlCSjVaRUZFR05SNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkRWUjQzQ1IzUkVJWU1ON0xJUEE2UzZDSk5VUFBaTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MjNIT0FCTzQ0VkRXWE1UNkhHUFg0UFRURTdZWTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxOTAwOTQwMjQzNzYxLCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZHSkxSN1pWNUpOQ1FHWlRNUzI1V0xMRVpQVEpYMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlZWNFRNNUNMUlNSN1YyR0wzUEY0TFhIUDdHWklENDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMTMxNTMyMTk2MDY2MDk3LCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlgyUlM1V1NDRExWTkhIRlZDVTVPSVBQSVZHRkVCRjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk1OTUxODY0ODQ5MjA1fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zSkIyNUNVQjdWUlEyWEhSS1BCUFVHU1ZUSE42RTA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m54864o1() {
        wx80 wx80VarM123716l = fy80.m123716l(Privilege.vip_unlimited_likes);
        this.f35655c.setText(wx80VarM123716l != null ? wx80VarM123716l.m205968t() : m54826s0(R$string.f27341W8));
        this.f35657e.setBackgroundResource(d3c0.f83981k);
        this.f35659g.setBackgroundResource(d3c0.f83925g);
        this.f35675w.m115452n(this.f35676x, CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.mfl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133601a.m54842R0((User) obj);
            }
        }));
        xdl0.m208344M(this.f35671s, true);
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        VText vText = this.f35672t;
        if (zMo33507h5) {
            vText.setText(wx80VarM123716l.m205948d());
        } else {
            vText.setText(R$string.f27111B9);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54861n0(this);
        if (xdl0.m208408w0() <= 1280) {
            this.f35657e.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 290.0f);
            this.f35657e.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 331.0f);
            ViewGroup.LayoutParams layoutParams = this.f35659g.getLayoutParams();
            int i = f35652A;
            layoutParams.width = i;
            ViewGroup.LayoutParams layoutParams2 = this.f35659g.getLayoutParams();
            int i2 = f35653B;
            layoutParams2.height = i2;
            this.f35660h.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 190.0f);
            this.f35660h.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 190.0f);
            this.f35666n.getLayoutParams().width = i;
            this.f35666n.getLayoutParams().height = i2;
            this.f35671s.getLayoutParams().width = i;
            this.f35671s.getLayoutParams().height = i2;
            this.f35655c.setTextSize(2, xdl0.m208408w0() < 960 ? 16.0f : 18.0f);
            this.f35672t.setTextSize(2, xdl0.m208408w0() < 960 ? 12.0f : 13.0f);
            this.f35667o.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 92.0f);
            this.f35667o.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 98.0f);
            this.f35668p.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 62.0f);
            this.f35668p.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 62.0f);
            this.f35670r.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 14.0f);
            ViewGroup.LayoutParams layoutParams3 = this.f35670r.getLayoutParams();
            int i3 = f35654C;
            layoutParams3.height = i3;
            this.f35669q.setPadding(0, i3, 0, i3);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final String m54865p0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1SRlZXR0pCRk0yRDREVVIyN0taTlVWMlg2RFpZNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDY5MzMxMzkxNTAxMDk5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5BSVlETVlYSUtKUkJDREw3M1BVN1pDWURMM0pXQzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgyNTg3MDM4MjI2MDAxNzQ3LCJhYiI6MH0.png";
        String strM133885y = i0g0.m133885y();
        if ("ko-KR".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktSREpJSUpISEpQVkdMVjZVVFlIUlpEMjRPSzdFSDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTI5NDc1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkYyVldYVDdZQ09WUlE0TU1OTUw3T1NLUllBWDdXUjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTY0NTcyNjM5NzE2NTE5NzQ5LCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVYVjJPVFBJNDZIVDZLVlJIN002QTRKRUxJU0ZGQTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTI5NDgzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjZVQlUyUzJEWDVYVjRHTldCN0Q0R1M1QVlGV1U2UDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mjk0MzU2NjYyMDc0Mjg5OTk3LCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlVBWTVYNFhJWUhTUjRXTVFINklPMllPVzJKQUpISzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTI5NTA3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkVWVkVVWkU3VUhCWk02TkFDRkFFRkFPTExJVE1VWjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mjc2MzQyMjYzNTY0ODA4MDQzLCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlJQRFQ1UkVQVUZMVjM0VE9BS1RFSTYzVkVLUkozVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTIzMzE3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkFSVzRMWkxBTFpLWERBQVlZUzVCUkhPU1FKUTVCSTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgyNTg3MDM4MjI2MDAxNzUzLCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlZUVlM3QjdGSlpUVTdUVEJISEwyVVkzVUhOWk02MzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDY5MzMxMzkxNTA3MzAzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IksyRjQ0Nk5XWkU2UzNMTkZWQkE2Uk9FN0RQS1hESDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgyNTg3MDM4MjI2MDAxNzY5LCJhYiI6MH0.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: p1 */
    public void m54866p1() {
        xdl0.m208344M(this.f35659g, false);
        xdl0.m208344M(this.f35666n, false);
        xdl0.m208344M(this.f35671s, false);
        switch (C8837b.f35680a[this.f35677y.ordinal()]) {
            case 1:
            case 2:
                m54844T0(this.f35677y);
                break;
            case 3:
                m54860m1();
                break;
            case 4:
                m54862n1();
                break;
            case 5:
                m54864o1();
                break;
            case 6:
                m54846V0();
                break;
            case 7:
                m54850Z0();
                break;
            case 8:
                m54851a1();
                break;
            case 9:
                m54843S0();
                break;
            case 10:
                m54847W0();
                break;
            case 11:
                m54852d1();
                break;
            case 12:
                m54854f1();
                break;
            case 13:
                m54855g1();
                break;
            case 14:
                m54853e1();
                break;
            case 15:
                m54845U0();
                break;
            case 16:
                m54849Y0();
                break;
            case 17:
                m54857j1();
                break;
            case 18:
                m54858k1();
                break;
            case 19:
                m54859l1();
                break;
            case 20:
                m54848X0();
                break;
            case 21:
                m54856h1();
                break;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final String m54867q0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkpLRUJHS1JBSTJRNk00N0pPQTc3TzdDNEhYQ05SVDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzU5NzczODEyNjYzNTg5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlhMWkhRU0MyNlFBVUEySzI2U05RVVU3R0FXUEJRWDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzU5ODQyNTMyMTQzOTI1LCJhYiI6MH0.png";
        String strM133885y = i0g0.m133885y();
        if ("ko-KR".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IldOUkJDU0hMVkRMNlhHWDM0SllGWDRFSVlHT1BZQzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzY1OTk4NzA4MDIxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc1TDVHSlRQVjJJQkZPMlBEQUVaWUFJWldEVFVVQTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzU5NzczODEyNjYzNjA1LCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik00RU9QVTRTS0hVM001TDdVUVYyQU1RTzVKVFJZRTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzY1OTk4NzA4MDIxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5UT0xCNVQyM0Y3SUdYSlJRTURKV09RWVlSS0oyUDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzY4NTY5OTA1Njg5Mzk3LCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdTQkdaVUxJM0hNVTNJS1Q0R0VGTjZGVEhRMlIySzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzMxNjM4OTczNzQ5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLNUlUTEdCSTczVTc2SU5ZVFdUU1FYTlVTNFYyNTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3NTM3Nzk3NDAzOTU3LCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlZESE5ZR05MTUVIS1ZRQjQ0SlhYVU5WUDVaUTJUNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzY4NTY5OTA0NjQxMzMzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjdOUkhOQjI1NUZONlcyV1NQUktEMkRUUklNS1lZMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzY4NTY5OTA0NjQxMzMzLCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlFGVkdVSUdVVjIyN1c0RDZVR0FUVjRURkZBUks1UiIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzA5OTM3NzM2NTk5ODcwODAwNSwiYWIiOjB9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilg0Ulc3SEdIRjJPMkhFNlNGRUpNN0I1NUNHVkhGUjA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzY1OTk4NzA3NDkzLCJhYiI6MH0.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m54868q1(String str) {
        VDraweeView vDraweeView = this.f35658f;
        if (vDraweeView != null) {
            vDraweeView.setImageResource(d3c0.f83981k);
        }
        qib0.f154691G.m102331L0(this.f35658f, str);
    }

    /* JADX INFO: renamed from: r0 */
    public final String m54869r0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlNHUFg0V1VLNVhaVVVFWldSN0FSNFRMMzVMWjZaSzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgyMDI3MzY3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IldUVExPTkdFM1ZUSldOSU5QSldVTFFRUTZYS040NjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY3NTQ3LCJhYiI6MH0.png";
        String strM133885y = i0g0.m133885y();
        if ("ko-KR".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhOTFpaSjJEV0NHSzc3UkpFVkZXTEo2U1pFQ1dHNTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgwOTc4NzU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjRPN0EyR0VLSlZKV1ZDVlhKN1BGSFpGT04zTlBGQTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTcyNjU1LCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdKUkFDN1hCSERMUTVSUVFIN0pVTVBRWTRLWjMyTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgyMDI3MzUxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ijc3SVc0Uk5EVEZWRzVLRTVVVVRRQU5PUTZIMlg0TTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY4NTU1LCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkNJNkZJNzdHMk43SEFIS0ZPSlpFV0ZQWkY1NENHQzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgwOTc4NzkxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk1UzNLUlpSWUdWVkJGVDMzMlA3VktHNlpQTkRUQjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY3NTc5LCJhYiI6MH0v.png";
        }
        if ("zh-TW".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjJVVFNVR05HUE9BWTZWNEVUMjdMVE1JVVNGTlZNTjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgyMDI3ODU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkM1Vlk2RjJCUjVHRjJHQk1UQkdWVEJQNDJDVFNMTTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY4NTQ3LCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM133885y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlhGNUtGUEtNNTVNSERRWkFISkw2R0VTTUdBQkpHWSIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzczODY3NjUyMDA4MjAyNzg2MywiYWIiOjB9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlpVRDJNRldEQjRWREdLWUFWVDdZWEJYSkRBV0RZMjA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY4NTUxLCJhYiI6MH0.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: t0 */
    public void m54870t0(PutongFrag putongFrag, C8839a.f fVar, Privilege privilege, Act act, PurchaseType purchaseType) {
        this.f35675w = fVar;
        this.f35676x = putongFrag;
        this.f35677y = privilege;
        this.f35678z = act;
        this.f35674v = purchaseType;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m54871u0(User user) {
        qib0.f154691G.m102341Q0(this.f35660h, user.m60124fp().profileMiddle());
        this.f35662j.setText(user.name);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m54872v0(boolean z, User user) {
        int i = d3c0.f83594H8;
        int i2 = d3c0.f83580G8;
        VDraweeView vDraweeView = this.f35658f;
        if (!z) {
            i = i2;
        }
        vDraweeView.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m54873w0(User user) {
        if (CoreModule.m29935P().m94651a().mo33507h5()) {
            m54868q1(m54863o0(zz6.m221004u0()));
        } else {
            m54868q1(zz6.m221004u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlFSVFpFSkVITzNZVDNVUTdBSUxZSVJYMzNIN0tCTiIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzU0NTMwNDAwNDQzODQ4Mzc2NSwiYWIiOjB9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkVFUkNYRzJESUFORkZIWDNDUTZFM1FIWFhVWllITjA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ1MzA0MDk4NjIzNzk2MDA5LCJhYiI6MH0.png");
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m54874x0(User user) {
        m54868q1(CoreModule.f17554l.m94651a().mo33360Lb());
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m54875y0(User user) {
        m54868q1(m54865p0(zz6.m221004u0()));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m54876z0(User user) {
        this.f35668p.setImageUrl(user.m60124fp().url);
    }

    public VipContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35673u = RoamedLocationData.new_();
    }

    public VipContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35673u = RoamedLocationData.new_();
    }
}
