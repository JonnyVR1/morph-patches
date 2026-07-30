package com.p000p1.mobile.putong.core.p004ui.result;

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
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import java.util.Locale;
import l.d3c0;
import l.e30;
import l.fy80;
import l.hgl0;
import l.hmb;
import l.i0g0;
import l.mkd0;
import l.nu0;
import l.t100;
import l.xdl0;
import l.zvf0;
import l.zz6;
import p006l.qib0;
import p006l.ura;
import p006l.wx80;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VLinear_FillerMeasure;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipContentDlgItemView extends VLinear {

    /* JADX INFO: renamed from: A */
    public static final int f5433A = t100.d(hmb.m1() * 210.0f);

    /* JADX INFO: renamed from: B */
    public static final int f5434B = t100.d(hmb.m1() * 280.0f);

    /* JADX INFO: renamed from: C */
    public static final int f5435C = t100.d(hmb.m1() * 15.0f);

    /* JADX INFO: renamed from: c */
    public VText f5436c;

    /* JADX INFO: renamed from: d */
    public VText f5437d;

    /* JADX INFO: renamed from: e */
    public VFrame f5438e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f5439f;

    /* JADX INFO: renamed from: g */
    public VRelative f5440g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f5441h;

    /* JADX INFO: renamed from: i */
    public VLinear_FillerMeasure f5442i;

    /* JADX INFO: renamed from: j */
    public VText f5443j;

    /* JADX INFO: renamed from: k */
    public VImage f5444k;

    /* JADX INFO: renamed from: l */
    public View f5445l;

    /* JADX INFO: renamed from: m */
    public View f5446m;

    /* JADX INFO: renamed from: n */
    public VFrame f5447n;

    /* JADX INFO: renamed from: o */
    public VFrame f5448o;

    /* JADX INFO: renamed from: p */
    public AutoVDraweeView f5449p;

    /* JADX INFO: renamed from: q */
    public VLinear f5450q;

    /* JADX INFO: renamed from: r */
    public VImage f5451r;

    /* JADX INFO: renamed from: s */
    public VFrame f5452s;

    /* JADX INFO: renamed from: t */
    public VText f5453t;

    /* JADX INFO: renamed from: u */
    public RoamedLocationData f5454u;

    /* JADX INFO: renamed from: v */
    public PurchaseType f5455v;

    /* JADX INFO: renamed from: w */
    public C0275a.f f5456w;

    /* JADX INFO: renamed from: x */
    public PutongFrag f5457x;

    /* JADX INFO: renamed from: y */
    public Privilege f5458y;

    /* JADX INFO: renamed from: z */
    public Act f5459z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContentDlgItemView$a */
    public class C0272a extends ClickableSpan {
        public C0272a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            zvf0.r("e_vip_privilege_badge_optional_button", "p_privilege_intro");
            CoreModule.m1851K().Fo(VipContentDlgItemView.this.f5457x.getActivity());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-11908534);
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContentDlgItemView$b */
    public static /* synthetic */ class C0273b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5461a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f5461a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5461a[Privilege.svip_badge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5461a[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5461a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5461a[Privilege.vip_unlimited_likes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5461a[Privilege.intl_no_ad.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5461a[Privilege.vip_location.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5461a[Privilege.message_read_state.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5461a[Privilege.advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5461a[Privilege.letter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5461a[Privilege.privacy_membership.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5461a[Privilege.recover_unmatches.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5461a[Privilege.see_who_likes_me.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5461a[Privilege.online_match_tickets.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5461a[Privilege.boost.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5461a[Privilege.liked_user.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5461a[Privilege.see_theme_unlock_more.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f5461a[Privilege.see_theme_unlock_online.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f5461a[Privilege.see_theme_unlock_pop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f5461a[Privilege.vip_letter_gp.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f5461a[Privilege.see_letter_gp.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public VipContentDlgItemView(@NonNull Context context) {
        super(context);
        this.f5454u = RoamedLocationData.new_();
    }

    private String getPrivacyMembershipImageUrl() {
        String strY = i0g0.y();
        if ("ko-KR".equals(strY)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IlJZVDRQV040RE1XS0pWSUZWNU1GWFFOWE82RlZRTjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MjUzNTUwMzU3MTA3NjMsImFiIjowfQ.png";
        }
        if ("ja-JP".equals(strY)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IkZTN1JIRkdPNVJOWVlQRFJaS1FVRkVLR0xNU0tQSDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MjU0MjM3NTM2MjI4OTF9.png";
        }
        if ("id-ID".equals(strY)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IlNKNFNEUVNDVkRPQlVKNE1BVlc2Nk03NDdaNllBVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM0OTAxMDIyMTM2Mzg0OTF9.png";
        }
        if ("zh-TW".equals(strY)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IjUyVzY3V1lYRDdETFMyVVI1UlVLRVBJSzJGRkRDTjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDQ2OTk3MDgyNTYwODE5LCJhYiI6MH0.png";
        }
        return "zh-CN".equals(strY) ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkxGWE80U0ZGTEQ3UlJTQzJRTjdFNTZWMkw1RU1DVzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDQ2OTk3MDgyNTYwODE5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc2SkVBMk9DSzYyNEpGM1hENVg3R1pKS0dSTE5YTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDQ2ODI1MjgxNzgwMDU5LCJhYiI6MH0.png";
    }

    private String getSVIPAdvancedFilterImageUrl() {
        return "en".equals(Locale.getDefault().getLanguage()) ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkROUVpTNkNUMkkzSTI3U1M3VEpNQ0tOVUlGS0pWVTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MDc5MDAyODg4ODMwMTksImFiIjowfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlJPQTVQRlU1VUpEUjdZREVCRkRWWEpXSDRWNENWNDA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MDc3NjI1ODA5Njk3ODMsImFiIjowfQ.png";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    private String m8187s0(@StringRes int i) {
        return getContext().getString(i);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m8188A0(RoamedLocationData roamedLocationData) {
        this.f5454u = roamedLocationData;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m8189B0(View view) {
        CoreModule.m1854P().m11706a().m5330Q8(this.f5459z, this.f5454u);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m8190D0(User user) {
        m8229q1(m8228q0(zz6.u0()));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m8191E0(User user) {
        m8229q1(getPrivacyMembershipImageUrl());
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m8192G0(User user) {
        String str;
        boolean zU0 = zz6.u0();
        if ("en".equals(Locale.getDefault().getLanguage())) {
            str = zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJKUUlWWjQ0V1NQWDY2TkZDSTQ3WU9ORFpBVFFRWDA4IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY2NjA4NjI3MTc5MTUzMTk5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkM3SVBIT1BJMk9ESENZVkNUQ0dTUFNHSFBXNzdOMzA4IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY4ODYwNDI2NzU4MDg3OTgzfQ.png";
        } else {
            str = zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkRaQkJHVUwyS0lUQjRMWkxBU1VQQjZRVEtXWkhQUjA5IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY2NjA4NjI3MTc5MTUyMTcxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjM3WjZCWU9aTE5XUU9ZVkpGVUZFSDQ3U0lEVDVUTjA4IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY4ODYwNDI2NzU4MDg3OTc5fQ.png";
        }
        m8229q1(str);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m8193H0(User user) {
        m8229q1(zz6.u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2NlNDNExPTUxXVEtQSDRMWEtORTNLUUtPMk4yTzA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY2NjA4NjI2OTEwNzE2NzE1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9WUjZENENISzZVRUszTFBPQjM0SURQRUJPV01SQzA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY4ODYwNDI2NzU3OTU2OTA3LCJhYiI6MH0.png");
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m8194I0(User user) {
        String str;
        boolean zU0 = zz6.u0();
        if ("en".equals(Locale.getDefault().getLanguage())) {
            str = zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJSQzRQSlpQM0tFVlI2V0I1NkdJVkFHSUNCNFZVTTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc4NjYzNzQzNzMwNTc1NjYzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkJWSFNDNUpOSlk1WlJWWjdHUk1NQU9HQkQ0UkxRMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc2OTc0ODg1MjgwMzc3MTM1LCJhYiI6MH0.png";
        } else {
            str = zU0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlI2REdFS0hNRkpERFVSWktYVVJOU0lYSks3QUxVNjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc4NjYzNzQzNzMwNTc1NjU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkcyVFBSRlpGRk9YT0ZTWlY0WDNaRkZZTFZMMkJUUTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc2OTc0ODg1MjgwMzc3MTMxLCJhYiI6MH0.png";
        }
        m8229q1(str);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m8195J0(User user) {
        m8229q1(zz6.u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IllOWUhVQUdYSk41VUxYWU5RVDNYWlJEUk5RN1FIUTA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc4NjYzNzQzNzMwNTc1NjU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlpDUUlMN1VUSTVZQVdHVTVPU1dKMzZDUVNIWjZHRCIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzY3Njk3NDg4NTI4MDM3NzEzMSwiYWIiOjB9.png");
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m8196K0(User user) {
        m8229q1(m8230r0(zz6.u0()));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m8197L0(User user) {
        m8229q1(CoreModule.m1854P().m11706a().m5334R6());
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m8198M0(User user) {
        m8229q1(CoreModule.m1854P().m11706a().m5428eg() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ3SDNFUUxLVjY3TzdaWTdDRUFWRFc1RTVGSk1SRjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNTQ2MDM0ODAwMTYwNDk5MDYxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IllWQlZETk1LUFpZQVBXQTRaWElDRFdKMkhFUVVNVDA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMzk4MzQ1NjA4NDExMTc1NzgxfQ.png");
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m8199N0(User user) {
        m8229q1(CoreModule.m1854P().m11706a().m5428eg() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjRXRUtZWVg2VFhZREdQWUNRUzVGV09IREc2UlRBWjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzQwMzkxNjYzNTY0MzAzMTg5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjNaTUtQQU83SVdLVkpVVFVBTTdXQkRDSkhENVJGSjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MTU1MTAyNDY4MDY0MzUzMTQxfQ.png");
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m8200O0(User user) {
        m8229q1(CoreModule.m1854P().m11706a().m5428eg() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjYyWVFKR0tFVExSSjVYUUNRSFYzSFlBRjJBSENCSDA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozODM0MDk5NjE1NDY2NTk3MjAxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFXMlZXSU5XQk5EMzNTUU1QNVg2NTdNNEdSU1BNMjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzk0ODExMTk5NDA0OTc2OTczfQ.png");
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m8201P0(User user) {
        this.f5452s.setBackgroundResource(user.isFemale() ? d3c0.y0 : d3c0.x0);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m8202Q0(User user) {
        qib0.f19782G.m12727D(this.f5452s, user.isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFaQ0dEMklOWFk2TFo1VFA0SkJCWklGREVGR1Y1WTE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTI3NjYyMTYwNTc0Mzg0MDIxNH0.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlhJUlZFVzVKVVdBTVBPUkwzTjZZUFRVSTZLSlE1NDE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzgzNjQ5NTUwNDEzODM5OTIxMH0.webp");
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m8203R0(User user) {
        qib0.f19782G.m12727D(this.f5452s, zz6.u0() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkZXUDVQR1VDRzdBQkxTTUFKNkFRVksyQ1YzN1lCTDE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDEyMzY4MTg4MDY4OTE5MTM1Mn0.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ikc3SDZYQVQzSlFOR09PWElBWDZGM1BaVEVZU1NNNTE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxODE1ODkxNTUyNDMyNzQ1MzE2MH0.webp");
    }

    /* JADX INFO: renamed from: S0 */
    public final void m8204S0() {
        wx80 wx80VarL = fy80.l(Privilege.advanced_filter);
        this.f5436c.setText(wx80VarL != null ? wx80VarL.m26849t() : "高级筛选");
        m8229q1(CoreModule.m1854P().m11706a().m5444h5() ? getSVIPAdvancedFilterImageUrl() : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFXUEVJNVFYSUhHREUyS1FXV0Y3NDYyQ0ZPNlZSRDA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MDc3NjI1ODA5Njc3MTksImFiIjowfQ.png");
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText = this.f5453t;
        if (zM5444h5) {
            vText.setText(wx80VarL.m26829d());
        } else {
            vText.setText("更多筛选条件\n遇见相似的人");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public final void m8205T0(Privilege privilege) {
        xdl0.M(this.f5440g, true);
        Privilege privilege2 = Privilege.vip_badge;
        wx80 wx80VarL = fy80.l(privilege2);
        this.f5436c.setText(wx80VarL != null ? wx80VarL.m26849t() : m8187s0(R.string.a9));
        if (CoreModule.m1854P().m11706a().m5444h5() && privilege == privilege2) {
            this.f5438e.setBackgroundResource(d3c0.F8);
        } else {
            this.f5438e.setBackgroundResource(d3c0.f);
        }
        this.f5440g.setBackgroundResource(d3c0.g);
        this.f5444k.setImageDrawable(nu0.b(getContext(), privilege == Privilege.svip_badge ? d3c0.Ya : CoreModule.m1854P().m11709e().m6916cc()));
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.sfl0
            public final void call(Object obj) {
                this.f21290a.m8232u0((User) obj);
            }
        }));
        String strM8187s0 = m8187s0(R.string.z9);
        String strM8187s1 = m8187s0(R.string.i);
        StringBuffer stringBuffer = new StringBuffer(strM8187s0);
        stringBuffer.append(" (");
        stringBuffer.append(strM8187s1);
        stringBuffer.append(')');
        String string = stringBuffer.toString();
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C0272a(), strM8187s0.length() + 1, string.length() - 1, 18);
        this.f5453t.setLines(4);
        this.f5453t.setText(spannableString);
        this.f5453t.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: U0 */
    public final void m8206U0() {
        wx80 wx80VarL = fy80.l(Privilege.boost);
        this.f5436c.setText(wx80VarL.m26849t());
        final boolean zU0 = zz6.u0();
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.xfl0
            public final void call(Object obj) {
                this.f27501a.m8233v0(zU0, (User) obj);
            }
        }));
        this.f5453t.setText(wx80VarL.m26829d());
    }

    /* JADX INFO: renamed from: V0 */
    public final void m8207V0() {
        wx80 wx80VarL = fy80.l(this.f5458y);
        this.f5436c.setText(wx80VarL != null ? wx80VarL.m26849t() : m8187s0(R.string.s6));
        this.f5438e.setBackgroundResource(d3c0.T0);
        qib0.f19782G.m12727D(this.f5452s, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjJRRFJNU1YzVk1MVzNMNDJSSkNKUzVXNE5TRExRWTE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTI5NDUzNDc5MzU0OTI3MzgzMn0.webp");
        xdl0.M(this.f5452s, true);
        this.f5453t.setText(wx80VarL != null ? wx80VarL.m26829d() : m8187s0(R.string.r6));
    }

    /* JADX INFO: renamed from: W0 */
    public final void m8208W0() {
        wx80 wx80VarL = fy80.l(Privilege.letter);
        this.f5436c.setText(wx80VarL.m26849t());
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.ggl0
            public final void call(Object obj) {
                this.f13314a.m8234w0((User) obj);
            }
        }));
        this.f5453t.setText(wx80VarL.m26829d());
    }

    /* JADX INFO: renamed from: X0 */
    public final void m8209X0() {
        wx80 wx80VarL = fy80.l(Privilege.vip_letter_gp);
        this.f5436c.setText(wx80VarL.m26849t());
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.lfl0
            public final void call(Object obj) {
                this.f16403a.m8235x0((User) obj);
            }
        }));
        this.f5453t.setText(wx80VarL.m26829d());
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m8210Y0() {
        wx80 wx80VarL = fy80.l(Privilege.liked_user);
        this.f5436c.setText(wx80VarL.m26849t());
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.nfl0
            public final void call(Object obj) {
                this.f17674a.m8236y0((User) obj);
            }
        }));
        this.f5453t.setText(wx80VarL.m26829d());
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m8211Z0() {
        wx80 wx80VarL = fy80.l(Privilege.vip_location);
        this.f5436c.setText(wx80VarL != null ? wx80VarL.m26849t() : m8187s0(R.string.X8));
        xdl0.M(this.f5447n, true);
        this.f5438e.setBackgroundResource(d3c0.h);
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.cgl0
            public final void call(Object obj) {
                this.f9652a.m8237z0((User) obj);
            }
        }));
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText = this.f5453t;
        if (zM5444h5) {
            vText.setText(wx80VarL.m26829d());
        } else {
            vText.setText(R.string.p);
        }
        if (CoreModule.f1534c.f3628e0.m21490p9().isVIP()) {
            xdl0.X(this.f5438e, t100.d(6.0f));
            xdl0.M(this.f5437d, true);
            this.f5437d.setText(m8187s0(R.string.R8) + " >");
            this.f5459z.duringCreated(CoreModule.f1534c.f3646k0.f4077R.k()).take(1).subscribe(mkd0.G(new e30() { // from class: l.dgl0
                public final void call(Object obj) {
                    this.f10394a.m8188A0((RoamedLocationData) obj);
                }
            }));
            this.f5437d.setOnClickListener(new View.OnClickListener() { // from class: l.egl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11139a.m8189B0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m8212a1() {
        wx80 wx80VarL = fy80.l(Privilege.message_read_state);
        this.f5436c.setText(wx80VarL != null ? wx80VarL.m26849t() : "查看消息已读状态");
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.ufl0
            public final void call(Object obj) {
                this.f23525a.m8190D0((User) obj);
            }
        }));
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText = this.f5453t;
        if (zM5444h5) {
            vText.setText(wx80VarL.m26829d());
        } else {
            vText.setText("显示对方是否看过你的消息\n不再被动苦苦等待");
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m8213d1() {
        wx80 wx80VarL = fy80.l(Privilege.privacy_membership);
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText = this.f5436c;
        if (zM5444h5) {
            vText.setText(wx80VarL.m26849t());
            this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.fgl0
                public final void call(Object obj) {
                    this.f12712a.m8191E0((User) obj);
                }
            }));
            this.f5453t.setText(wx80VarL.m26829d());
        } else {
            vText.setText(wx80VarL != null ? wx80VarL.m26849t() : "隐私特权");
            m8229q1(CoreModule.m1854P().m11706a().m5444h5() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlUySERRN1hCRklOWVJQRE1HMjI1Wk03VVFBWU1aSTA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDI5MjY3MDU0OTA5NzM5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlNTM05HS0QzU1oyTTVLSFRZNENEU0ZYN0ZSWTZTMzA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDI5MjY3MDU0OTA1NjM1LCJhYiI6MH0.png");
            this.f5453t.setText("只对我喜欢的人可见\n隐藏会员身份等");
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m8214e1() {
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText = this.f5436c;
        if (!zM5444h5) {
            vText.setText("在线闪聊");
            this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.rfl0
                public final void call(Object obj) {
                    this.f20540a.m8193H0((User) obj);
                }
            }));
            this.f5453t.setText("立刻获得神秘配对\n实时互动畅聊无阻！");
        } else {
            vText.setText(CoreModule.m1854P().m11706a().m5410bk());
            this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.qfl0
                public final void call(Object obj) {
                    this.f19732a.m8192G0((User) obj);
                }
            }));
            this.f5453t.setText(String.format(CoreModule.m1854P().m11706a().m5278Il(), CoreModule.m1854P().m11706a().m5284Jj()));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m8215f1() {
        wx80 wx80VarL = fy80.l(Privilege.recover_unmatches);
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText = this.f5436c;
        if (zM5444h5) {
            vText.setText(wx80VarL.m26849t());
            this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.zfl0
                public final void call(Object obj) {
                    this.f28737a.m8194I0((User) obj);
                }
            }));
            this.f5453t.setText(wx80VarL.m26846q());
        } else {
            vText.setText(wx80VarL != null ? wx80VarL.m26849t() : "找回解除的配对");
            this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.agl0
                public final void call(Object obj) {
                    this.f8256a.m8195J0((User) obj);
                }
            }));
            this.f5453t.setText(wx80VarL != null ? wx80VarL.m26846q() : "不错过每一次缘分");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public final void m8216g1() {
        wx80 wx80VarL = fy80.l(Privilege.see_who_likes_me);
        this.f5436c.setText(wx80VarL != null ? wx80VarL.m26849t() : getResources().getString(R.string.N6));
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.vfl0
            public final void call(Object obj) {
                this.f24308a.m8196K0((User) obj);
            }
        }));
        this.f5453t.setText(R.string.K6);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m8217h1() {
        wx80 wx80VarL = fy80.l(Privilege.see_letter_gp);
        this.f5436c.setText(wx80VarL.m26849t());
        this.f5453t.setText(wx80VarL.m26829d());
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.wfl0
            public final void call(Object obj) {
                this.f25138a.m8197L0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public final void m8218j1() {
        wx80 wx80VarL = fy80.l(Privilege.see_theme_unlock_more);
        this.f5436c.setText(wx80VarL.m26849t());
        this.f5453t.setText(wx80VarL.m26829d());
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.yfl0
            public final void call(Object obj) {
                this.f28196a.m8198M0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k1 */
    public final void m8219k1() {
        wx80 wx80VarL = fy80.l(Privilege.see_theme_unlock_online);
        this.f5436c.setText(wx80VarL.m26849t());
        this.f5453t.setText(wx80VarL.m26829d());
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.bgl0
            public final void call(Object obj) {
                this.f8876a.m8199N0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l1 */
    public final void m8220l1() {
        wx80 wx80VarL = fy80.l(Privilege.see_theme_unlock_pop);
        this.f5436c.setText(wx80VarL.m26849t());
        this.f5453t.setText(wx80VarL.m26829d());
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.tfl0
            public final void call(Object obj) {
                this.f22087a.m8200O0((User) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public final void m8221m1() {
        wx80 wx80VarL = fy80.l(Privilege.vip_super_like);
        boolean zM5671Oi = ura.m25555e().m25559d().m5671Oi();
        VText vText = this.f5436c;
        if (zM5671Oi) {
            vText.setText(wx80VarL.m26849t());
        } else {
            vText.setText(getContext().getString(R.string.b9, 5));
        }
        xdl0.M(this.f5452s, true);
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.ofl0
            public final void call(Object obj) {
                this.f18223a.m8201P0((User) obj);
            }
        }));
        this.f5438e.setBackgroundResource(d3c0.i);
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText2 = this.f5453t;
        if (zM5444h5) {
            vText2.setText(wx80VarL.m26829d());
        } else {
            vText2.setText(R.string.g2);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m8222n0(View view) {
        hgl0.a(this, view);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m8223n1() {
        wx80 wx80VarL = fy80.l(Privilege.vip_undo);
        this.f5436c.setText(wx80VarL != null ? wx80VarL.m26849t() : m8187s0(R.string.Z8));
        this.f5438e.setBackgroundResource(d3c0.j);
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.pfl0
            public final void call(Object obj) {
                this.f18719a.m8202Q0((User) obj);
            }
        }));
        xdl0.M(this.f5452s, true);
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText = this.f5453t;
        if (zM5444h5) {
            vText.setText(wx80VarL.m26829d());
        } else {
            vText.setText(R.string.L7);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final String m8224o0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IllSS1hPN1VJNTdYNVJLNTRWN09GTzVTWUZBWEZUNjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk1OTUxODY0ODQ5MjA1fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkpZWkdENEFWQkNYRUFBSzVXNFhEM1A3NkJHTFhNNjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        String strY = i0g0.y();
        if ("ko-KR".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjVYU0xMVEpKSFhaSzRBS1A2SDNBT0daSFg1VFMyVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjJWQkJaVEJLWjY0NVlCUkpBNUpWN1ZDUDdDSUxJSjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IklEN0wzWUg1MkZCNVpaMjRIT0VDVlFDUTdHRVpKVTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEQUY3UVVQUE1FWlMyTkZIVFlCSjVaRUZFR05SNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkRWUjQzQ1IzUkVJWU1ON0xJUEE2UzZDSk5VUFBaTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MjNIT0FCTzQ0VkRXWE1UNkhHUFg0UFRURTdZWTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxOTAwOTQwMjQzNzYxLCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZHSkxSN1pWNUpOQ1FHWlRNUzI1V0xMRVpQVEpYMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlZWNFRNNUNMUlNSN1YyR0wzUEY0TFhIUDdHWklENDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMTMxNTMyMTk2MDY2MDk3LCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlgyUlM1V1NDRExWTkhIRlZDVTVPSVBQSVZHRkVCRjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk1OTUxODY0ODQ5MjA1fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zSkIyNUNVQjdWUlEyWEhSS1BCUFVHU1ZUSE42RTA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m8225o1() {
        wx80 wx80VarL = fy80.l(Privilege.vip_unlimited_likes);
        this.f5436c.setText(wx80VarL != null ? wx80VarL.m26849t() : m8187s0(R.string.W8));
        this.f5438e.setBackgroundResource(d3c0.k);
        this.f5440g.setBackgroundResource(d3c0.g);
        this.f5456w.n(this.f5457x, CoreModule.f1534c.f3628e0.m21486o9()).subscribe(mkd0.G(new e30() { // from class: l.mfl0
            public final void call(Object obj) {
                this.f16959a.m8203R0((User) obj);
            }
        }));
        xdl0.M(this.f5452s, true);
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        VText vText = this.f5453t;
        if (zM5444h5) {
            vText.setText(wx80VarL.m26829d());
        } else {
            vText.setText(R.string.B9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8222n0(this);
        if (xdl0.w0() <= 1280) {
            this.f5438e.getLayoutParams().height = t100.d(hmb.m1() * 290.0f);
            this.f5438e.getLayoutParams().width = t100.d(hmb.m1() * 331.0f);
            ViewGroup.LayoutParams layoutParams = this.f5440g.getLayoutParams();
            int i = f5433A;
            layoutParams.width = i;
            ViewGroup.LayoutParams layoutParams2 = this.f5440g.getLayoutParams();
            int i2 = f5434B;
            layoutParams2.height = i2;
            this.f5441h.getLayoutParams().width = t100.d(hmb.m1() * 190.0f);
            this.f5441h.getLayoutParams().height = t100.d(hmb.m1() * 190.0f);
            this.f5447n.getLayoutParams().width = i;
            this.f5447n.getLayoutParams().height = i2;
            this.f5452s.getLayoutParams().width = i;
            this.f5452s.getLayoutParams().height = i2;
            this.f5436c.setTextSize(2, xdl0.w0() < 960 ? 16.0f : 18.0f);
            this.f5453t.setTextSize(2, xdl0.w0() < 960 ? 12.0f : 13.0f);
            this.f5448o.getLayoutParams().width = t100.d(hmb.m1() * 92.0f);
            this.f5448o.getLayoutParams().height = t100.d(hmb.m1() * 98.0f);
            this.f5449p.getLayoutParams().height = t100.d(hmb.m1() * 62.0f);
            this.f5449p.getLayoutParams().height = t100.d(hmb.m1() * 62.0f);
            this.f5451r.getLayoutParams().width = t100.d(hmb.m1() * 14.0f);
            ViewGroup.LayoutParams layoutParams3 = this.f5451r.getLayoutParams();
            int i3 = f5435C;
            layoutParams3.height = i3;
            this.f5450q.setPadding(0, i3, 0, i3);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final String m8226p0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1SRlZXR0pCRk0yRDREVVIyN0taTlVWMlg2RFpZNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDY5MzMxMzkxNTAxMDk5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5BSVlETVlYSUtKUkJDREw3M1BVN1pDWURMM0pXQzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgyNTg3MDM4MjI2MDAxNzQ3LCJhYiI6MH0.png";
        String strY = i0g0.y();
        if ("ko-KR".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktSREpJSUpISEpQVkdMVjZVVFlIUlpEMjRPSzdFSDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTI5NDc1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkYyVldYVDdZQ09WUlE0TU1OTUw3T1NLUllBWDdXUjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTY0NTcyNjM5NzE2NTE5NzQ5LCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVYVjJPVFBJNDZIVDZLVlJIN002QTRKRUxJU0ZGQTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTI5NDgzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjZVQlUyUzJEWDVYVjRHTldCN0Q0R1M1QVlGV1U2UDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mjk0MzU2NjYyMDc0Mjg5OTk3LCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlVBWTVYNFhJWUhTUjRXTVFINklPMllPVzJKQUpISzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTI5NTA3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkVWVkVVWkU3VUhCWk02TkFDRkFFRkFPTExJVE1VWjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mjc2MzQyMjYzNTY0ODA4MDQzLCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlJQRFQ1UkVQVUZMVjM0VE9BS1RFSTYzVkVLUkozVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTIzMzE3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkFSVzRMWkxBTFpLWERBQVlZUzVCUkhPU1FKUTVCSTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgyNTg3MDM4MjI2MDAxNzUzLCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlZUVlM3QjdGSlpUVTdUVEJISEwyVVkzVUhOWk02MzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDY5MzMxMzkxNTA3MzAzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IksyRjQ0Nk5XWkU2UzNMTkZWQkE2Uk9FN0RQS1hESDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgyNTg3MDM4MjI2MDAxNzY5LCJhYiI6MH0.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: p1 */
    public void m8227p1() {
        xdl0.M(this.f5440g, false);
        xdl0.M(this.f5447n, false);
        xdl0.M(this.f5452s, false);
        switch (C0273b.f5461a[this.f5458y.ordinal()]) {
            case 1:
            case 2:
                m8205T0(this.f5458y);
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                m8221m1();
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                m8223n1();
                break;
            case 5:
                m8225o1();
                break;
            case 6:
                m8207V0();
                break;
            case 7:
                m8211Z0();
                break;
            case 8:
                m8212a1();
                break;
            case 9:
                m8204S0();
                break;
            case 10:
                m8208W0();
                break;
            case 11:
                m8213d1();
                break;
            case 12:
                m8215f1();
                break;
            case 13:
                m8216g1();
                break;
            case 14:
                m8214e1();
                break;
            case 15:
                m8206U0();
                break;
            case 16:
                m8210Y0();
                break;
            case 17:
                m8218j1();
                break;
            case 18:
                m8219k1();
                break;
            case 19:
                m8220l1();
                break;
            case 20:
                m8209X0();
                break;
            case 21:
                m8217h1();
                break;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final String m8228q0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkpLRUJHS1JBSTJRNk00N0pPQTc3TzdDNEhYQ05SVDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzU5NzczODEyNjYzNTg5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlhMWkhRU0MyNlFBVUEySzI2U05RVVU3R0FXUEJRWDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzU5ODQyNTMyMTQzOTI1LCJhYiI6MH0.png";
        String strY = i0g0.y();
        if ("ko-KR".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IldOUkJDU0hMVkRMNlhHWDM0SllGWDRFSVlHT1BZQzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzY1OTk4NzA4MDIxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc1TDVHSlRQVjJJQkZPMlBEQUVaWUFJWldEVFVVQTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzU5NzczODEyNjYzNjA1LCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik00RU9QVTRTS0hVM001TDdVUVYyQU1RTzVKVFJZRTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzY1OTk4NzA4MDIxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5UT0xCNVQyM0Y3SUdYSlJRTURKV09RWVlSS0oyUDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzY4NTY5OTA1Njg5Mzk3LCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdTQkdaVUxJM0hNVTNJS1Q0R0VGTjZGVEhRMlIySzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzMxNjM4OTczNzQ5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLNUlUTEdCSTczVTc2SU5ZVFdUU1FYTlVTNFYyNTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3NTM3Nzk3NDAzOTU3LCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlZESE5ZR05MTUVIS1ZRQjQ0SlhYVU5WUDVaUTJUNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzY4NTY5OTA0NjQxMzMzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjdOUkhOQjI1NUZONlcyV1NQUktEMkRUUklNS1lZMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzY4NTY5OTA0NjQxMzMzLCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlFGVkdVSUdVVjIyN1c0RDZVR0FUVjRURkZBUks1UiIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzA5OTM3NzM2NTk5ODcwODAwNSwiYWIiOjB9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilg0Ulc3SEdIRjJPMkhFNlNGRUpNN0I1NUNHVkhGUjA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzY1OTk4NzA3NDkzLCJhYiI6MH0.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m8229q1(String str) {
        VDraweeView vDraweeView = this.f5439f;
        if (vDraweeView != null) {
            vDraweeView.setImageResource(d3c0.k);
        }
        qib0.f19782G.m12744L0(this.f5439f, str);
    }

    /* JADX INFO: renamed from: r0 */
    public final String m8230r0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlNHUFg0V1VLNVhaVVVFWldSN0FSNFRMMzVMWjZaSzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgyMDI3MzY3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IldUVExPTkdFM1ZUSldOSU5QSldVTFFRUTZYS040NjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY3NTQ3LCJhYiI6MH0.png";
        String strY = i0g0.y();
        if ("ko-KR".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhOTFpaSjJEV0NHSzc3UkpFVkZXTEo2U1pFQ1dHNTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgwOTc4NzU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjRPN0EyR0VLSlZKV1ZDVlhKN1BGSFpGT04zTlBGQTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTcyNjU1LCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdKUkFDN1hCSERMUTVSUVFIN0pVTVBRWTRLWjMyTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgyMDI3MzUxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ijc3SVc0Uk5EVEZWRzVLRTVVVVRRQU5PUTZIMlg0TTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY4NTU1LCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkNJNkZJNzdHMk43SEFIS0ZPSlpFV0ZQWkY1NENHQzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgwOTc4NzkxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk1UzNLUlpSWUdWVkJGVDMzMlA3VktHNlpQTkRUQjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY3NTc5LCJhYiI6MH0v.png";
        }
        if ("zh-TW".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjJVVFNVR05HUE9BWTZWNEVUMjdMVE1JVVNGTlZNTjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgyMDI3ODU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkM1Vlk2RjJCUjVHRjJHQk1UQkdWVEJQNDJDVFNMTTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY4NTQ3LCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strY)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlhGNUtGUEtNNTVNSERRWkFISkw2R0VTTUdBQkpHWSIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzczODY3NjUyMDA4MjAyNzg2MywiYWIiOjB9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlpVRDJNRldEQjRWREdLWUFWVDdZWEJYSkRBV0RZMjA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY4NTUxLCJhYiI6MH0.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: t0 */
    public void m8231t0(PutongFrag putongFrag, C0275a.f fVar, Privilege privilege, Act act, PurchaseType purchaseType) {
        this.f5456w = fVar;
        this.f5457x = putongFrag;
        this.f5458y = privilege;
        this.f5459z = act;
        this.f5455v = purchaseType;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m8232u0(User user) {
        qib0.f19782G.m12754Q0(this.f5441h, user.fp().profileMiddle());
        this.f5443j.setText(user.name);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m8233v0(boolean z, User user) {
        int i = d3c0.H8;
        int i2 = d3c0.G8;
        VDraweeView vDraweeView = this.f5439f;
        if (!z) {
            i = i2;
        }
        vDraweeView.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m8234w0(User user) {
        if (CoreModule.m1854P().m11706a().m5444h5()) {
            m8229q1(m8224o0(zz6.u0()));
        } else {
            m8229q1(zz6.u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlFSVFpFSkVITzNZVDNVUTdBSUxZSVJYMzNIN0tCTiIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzU0NTMwNDAwNDQzODQ4Mzc2NSwiYWIiOjB9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkVFUkNYRzJESUFORkZIWDNDUTZFM1FIWFhVWllITjA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ1MzA0MDk4NjIzNzk2MDA5LCJhYiI6MH0.png");
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m8235x0(User user) {
        m8229q1(CoreModule.f1543l.m11706a().m5297Lb());
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m8236y0(User user) {
        m8229q1(m8226p0(zz6.u0()));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8237z0(User user) {
        this.f5449p.setImageUrl(((Media) user.fp()).url);
    }

    public VipContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5454u = RoamedLocationData.new_();
    }

    public VipContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5454u = RoamedLocationData.new_();
    }
}
