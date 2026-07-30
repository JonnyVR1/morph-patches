package com.p051p1.mobile.putong.core.p058ui.result;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import java.util.Locale;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VRelative;
import p151v.VText;
import p153l.a690;
import p153l.bnl0;
import p153l.c17;
import p153l.gta;
import p153l.i4g0;
import p153l.j690;
import p153l.jbc0;
import p153l.lpl0;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.tu0;
import p153l.uqb0;
import p153l.vnb;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class VipContentDlgItemView extends VLinear {

    /* JADX INFO: renamed from: A */
    public static final int f36500A = qa00.m175859d(vnb.m201953m1() * 210.0f);

    /* JADX INFO: renamed from: B */
    public static final int f36501B = qa00.m175859d(vnb.m201953m1() * 280.0f);

    /* JADX INFO: renamed from: C */
    public static final int f36502C = qa00.m175859d(vnb.m201953m1() * 15.0f);

    /* JADX INFO: renamed from: c */
    public VText f36503c;

    /* JADX INFO: renamed from: d */
    public VText f36504d;

    /* JADX INFO: renamed from: e */
    public VFrame f36505e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f36506f;

    /* JADX INFO: renamed from: g */
    public VRelative f36507g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f36508h;

    /* JADX INFO: renamed from: i */
    public VLinear_FillerMeasure f36509i;

    /* JADX INFO: renamed from: j */
    public VText f36510j;

    /* JADX INFO: renamed from: k */
    public VImage f36511k;

    /* JADX INFO: renamed from: l */
    public View f36512l;

    /* JADX INFO: renamed from: m */
    public View f36513m;

    /* JADX INFO: renamed from: n */
    public VFrame f36514n;

    /* JADX INFO: renamed from: o */
    public VFrame f36515o;

    /* JADX INFO: renamed from: p */
    public AutoVDraweeView f36516p;

    /* JADX INFO: renamed from: q */
    public VLinear f36517q;

    /* JADX INFO: renamed from: r */
    public VImage f36518r;

    /* JADX INFO: renamed from: s */
    public VFrame f36519s;

    /* JADX INFO: renamed from: t */
    public VText f36520t;

    /* JADX INFO: renamed from: u */
    public RoamedLocationData f36521u;

    /* JADX INFO: renamed from: v */
    public PurchaseType f36522v;

    /* JADX INFO: renamed from: w */
    public C9002a.f f36523w;

    /* JADX INFO: renamed from: x */
    public PutongFrag f36524x;

    /* JADX INFO: renamed from: y */
    public Privilege f36525y;

    /* JADX INFO: renamed from: z */
    public Act f36526z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContentDlgItemView$a */
    public class C8999a extends ClickableSpan {
        public C8999a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            i4g0.m138520r("e_vip_privilege_badge_optional_button", "p_privilege_intro");
            CoreModule.m30930K().mo31691Fo(VipContentDlgItemView.this.f36524x.getActivity());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-11908534);
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.VipContentDlgItemView$b */
    public static /* synthetic */ class C9000b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36528a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f36528a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36528a[Privilege.svip_badge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36528a[Privilege.vip_super_like.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36528a[Privilege.vip_undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36528a[Privilege.vip_unlimited_likes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36528a[Privilege.intl_no_ad.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36528a[Privilege.vip_location.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36528a[Privilege.message_read_state.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36528a[Privilege.advanced_filter.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36528a[Privilege.letter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36528a[Privilege.privacy_membership.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36528a[Privilege.recover_unmatches.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36528a[Privilege.see_who_likes_me.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f36528a[Privilege.online_match_tickets.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f36528a[Privilege.boost.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f36528a[Privilege.liked_user.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f36528a[Privilege.see_theme_unlock_more.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f36528a[Privilege.see_theme_unlock_online.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f36528a[Privilege.see_theme_unlock_pop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f36528a[Privilege.vip_letter_gp.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f36528a[Privilege.see_letter_gp.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public VipContentDlgItemView(@NonNull Context context) {
        super(context);
        this.f36521u = RoamedLocationData.new_();
    }

    private String getPrivacyMembershipImageUrl() {
        String strM175820y = q8g0.m175820y();
        if ("ko-KR".equals(strM175820y)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IlJZVDRQV040RE1XS0pWSUZWNU1GWFFOWE82RlZRTjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MjUzNTUwMzU3MTA3NjMsImFiIjowfQ.png";
        }
        if ("ja-JP".equals(strM175820y)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IkZTN1JIRkdPNVJOWVlQRFJaS1FVRkVLR0xNU0tQSDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MjU0MjM3NTM2MjI4OTF9.png";
        }
        if ("id-ID".equals(strM175820y)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IlNKNFNEUVNDVkRPQlVKNE1BVlc2Nk03NDdaNllBVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM0OTAxMDIyMTM2Mzg0OTF9.png";
        }
        if ("zh-TW".equals(strM175820y)) {
            return "https://auto.tancdn.com/v1/images/eyJpZCI6IjUyVzY3V1lYRDdETFMyVVI1UlVLRVBJSzJGRkRDTjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDQ2OTk3MDgyNTYwODE5LCJhYiI6MH0.png";
        }
        return "zh-CN".equals(strM175820y) ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkxGWE80U0ZGTEQ3UlJTQzJRTjdFNTZWMkw1RU1DVzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDQ2OTk3MDgyNTYwODE5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc2SkVBMk9DSzYyNEpGM1hENVg3R1pKS0dSTE5YTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDQ2ODI1MjgxNzgwMDU5LCJhYiI6MH0.png";
    }

    private String getSVIPAdvancedFilterImageUrl() {
        return "en".equals(Locale.getDefault().getLanguage()) ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkROUVpTNkNUMkkzSTI3U1M3VEpNQ0tOVUlGS0pWVTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MDc5MDAyODg4ODMwMTksImFiIjowfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlJPQTVQRlU1VUpEUjdZREVCRkRWWEpXSDRWNENWNDA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MDc3NjI1ODA5Njk3ODMsImFiIjowfQ.png";
    }

    /* JADX INFO: renamed from: s0 */
    private String m56009s0(@StringRes int i) {
        return getContext().getString(i);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m56010A0(RoamedLocationData roamedLocationData) {
        this.f36521u = roamedLocationData;
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m56011B0(View view) {
        CoreModule.m30933P().m143405a().mo34396Q8(this.f36526z, this.f36521u);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m56012D0(User user) {
        m56051q1(m56050q0(c17.m107528u0()));
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m56013E0(User user) {
        m56051q1(getPrivacyMembershipImageUrl());
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m56014G0(User user) {
        String str;
        boolean zM107528u0 = c17.m107528u0();
        if ("en".equals(Locale.getDefault().getLanguage())) {
            str = zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJKUUlWWjQ0V1NQWDY2TkZDSTQ3WU9ORFpBVFFRWDA4IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY2NjA4NjI3MTc5MTUzMTk5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkM3SVBIT1BJMk9ESENZVkNUQ0dTUFNHSFBXNzdOMzA4IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY4ODYwNDI2NzU4MDg3OTgzfQ.png";
        } else {
            str = zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkRaQkJHVUwyS0lUQjRMWkxBU1VQQjZRVEtXWkhQUjA5IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY2NjA4NjI3MTc5MTUyMTcxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjM3WjZCWU9aTE5XUU9ZVkpGVUZFSDQ3U0lEVDVUTjA4IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY4ODYwNDI2NzU4MDg3OTc5fQ.png";
        }
        m56051q1(str);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m56015H0(User user) {
        m56051q1(c17.m107528u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ilk2NlNDNExPTUxXVEtQSDRMWEtORTNLUUtPMk4yTzA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY2NjA4NjI2OTEwNzE2NzE1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9WUjZENENISzZVRUszTFBPQjM0SURQRUJPV01SQzA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjY4ODYwNDI2NzU3OTU2OTA3LCJhYiI6MH0.png");
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m56016I0(User user) {
        String str;
        boolean zM107528u0 = c17.m107528u0();
        if ("en".equals(Locale.getDefault().getLanguage())) {
            str = zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkJSQzRQSlpQM0tFVlI2V0I1NkdJVkFHSUNCNFZVTTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc4NjYzNzQzNzMwNTc1NjYzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkJWSFNDNUpOSlk1WlJWWjdHUk1NQU9HQkQ0UkxRMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc2OTc0ODg1MjgwMzc3MTM1LCJhYiI6MH0.png";
        } else {
            str = zM107528u0 ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlI2REdFS0hNRkpERFVSWktYVVJOU0lYSks3QUxVNjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc4NjYzNzQzNzMwNTc1NjU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkcyVFBSRlpGRk9YT0ZTWlY0WDNaRkZZTFZMMkJUUTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc2OTc0ODg1MjgwMzc3MTMxLCJhYiI6MH0.png";
        }
        m56051q1(str);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m56017J0(User user) {
        m56051q1(c17.m107528u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IllOWUhVQUdYSk41VUxYWU5RVDNYWlJEUk5RN1FIUTA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNjc4NjYzNzQzNzMwNTc1NjU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlpDUUlMN1VUSTVZQVdHVTVPU1dKMzZDUVNIWjZHRCIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzY3Njk3NDg4NTI4MDM3NzEzMSwiYWIiOjB9.png");
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m56018K0(User user) {
        m56051q1(m56052r0(c17.m107528u0()));
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m56019L0(User user) {
        m56051q1(CoreModule.m30933P().m143405a().mo34400R6());
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m56020M0(User user) {
        m56051q1(CoreModule.m30933P().m143405a().mo34494eg() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ3SDNFUUxLVjY3TzdaWTdDRUFWRFc1RTVGSk1SRjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyNTQ2MDM0ODAwMTYwNDk5MDYxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IllWQlZETk1LUFpZQVBXQTRaWElDRFdKMkhFUVVNVDA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMzk4MzQ1NjA4NDExMTc1NzgxfQ.png");
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m56021N0(User user) {
        m56051q1(CoreModule.m30933P().m143405a().mo34494eg() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjRXRUtZWVg2VFhZREdQWUNRUzVGV09IREc2UlRBWjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzQwMzkxNjYzNTY0MzAzMTg5fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjNaTUtQQU83SVdLVkpVVFVBTTdXQkRDSkhENVJGSjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2MTU1MTAyNDY4MDY0MzUzMTQxfQ.png");
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m56022O0(User user) {
        m56051q1(CoreModule.m30933P().m143405a().mo34494eg() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjYyWVFKR0tFVExSSjVYUUNRSFYzSFlBRjJBSENCSDA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozODM0MDk5NjE1NDY2NTk3MjAxfQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFXMlZXSU5XQk5EMzNTUU1QNVg2NTdNNEdSU1BNMjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzk0ODExMTk5NDA0OTc2OTczfQ.png");
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m56023P0(User user) {
        this.f36519s.setBackgroundResource(user.isFemale() ? jbc0.f119833y0 : jbc0.f119819x0);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m56024Q0(User user) {
        uqb0.f180374G.m127098D(this.f36519s, user.isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFaQ0dEMklOWFk2TFo1VFA0SkJCWklGREVGR1Y1WTE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTI3NjYyMTYwNTc0Mzg0MDIxNH0.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlhJUlZFVzVKVVdBTVBPUkwzTjZZUFRVSTZLSlE1NDE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMzgzNjQ5NTUwNDEzODM5OTIxMH0.webp");
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m56025R0(User user) {
        uqb0.f180374G.m127098D(this.f36519s, c17.m107528u0() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkZXUDVQR1VDRzdBQkxTTUFKNkFRVksyQ1YzN1lCTDE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDEyMzY4MTg4MDY4OTE5MTM1Mn0.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ikc3SDZYQVQzSlFOR09PWElBWDZGM1BaVEVZU1NNNTE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxODE1ODkxNTUyNDMyNzQ1MzE2MH0.webp");
    }

    /* JADX INFO: renamed from: S0 */
    public final void m56026S0() {
        a690 a690VarM143620l = j690.m143620l(Privilege.advanced_filter);
        this.f36503c.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : "高级筛选");
        m56051q1(CoreModule.m30933P().m143405a().mo34510h5() ? getSVIPAdvancedFilterImageUrl() : "https://auto.tancdn.com/v1/images/eyJpZCI6IlFXUEVJNVFYSUhHREUyS1FXV0Y3NDYyQ0ZPNlZSRDA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3OTM1MDc3NjI1ODA5Njc3MTksImFiIjowfQ.png");
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText = this.f36520t;
        if (zMo34510h5) {
            vText.setText(a690VarM143620l.m96294d());
        } else {
            vText.setText("更多筛选条件\n遇见相似的人");
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m56027T0(Privilege privilege) {
        bnl0.m105524M(this.f36507g, true);
        Privilege privilege2 = Privilege.vip_badge;
        a690 a690VarM143620l = j690.m143620l(privilege2);
        this.f36503c.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : m56009s0(R$string.f28234a9));
        if (CoreModule.m30933P().m143405a().mo34510h5() && privilege == privilege2) {
            this.f36505e.setBackgroundResource(jbc0.f119221F8);
        } else {
            this.f36505e.setBackgroundResource(jbc0.f119566f);
        }
        this.f36507g.setBackgroundResource(jbc0.f119580g);
        this.f36511k.setImageDrawable(tu0.m192702b(getContext(), privilege == Privilege.svip_badge ? jbc0.f119481Ya : CoreModule.m30933P().m143408e().mo35982cc()));
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.wol0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190049a.m56054u0((User) obj);
            }
        }));
        String strM56009s0 = m56009s0(R$string.f28525z9);
        String strM56009s1 = m56009s0(R$string.f28320i);
        StringBuffer stringBuffer = new StringBuffer(strM56009s0);
        stringBuffer.append(" (");
        stringBuffer.append(strM56009s1);
        stringBuffer.append(')');
        String string = stringBuffer.toString();
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new C8999a(), strM56009s0.length() + 1, string.length() - 1, 18);
        this.f36520t.setLines(4);
        this.f36520t.setText(spannableString);
        this.f36520t.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: U0 */
    public final void m56028U0() {
        a690 a690VarM143620l = j690.m143620l(Privilege.boost);
        this.f36503c.setText(a690VarM143620l.m96314t());
        final boolean zM107528u0 = c17.m107528u0();
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.bpl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77786a.m56055v0(zM107528u0, (User) obj);
            }
        }));
        this.f36520t.setText(a690VarM143620l.m96294d());
    }

    /* JADX INFO: renamed from: V0 */
    public final void m56029V0() {
        a690 a690VarM143620l = j690.m143620l(this.f36525y);
        this.f36503c.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : m56009s0(R$string.f28445s6));
        this.f36505e.setBackgroundResource(jbc0.f119406T0);
        uqb0.f180374G.m127098D(this.f36519s, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjJRRFJNU1YzVk1MVzNMNDJSSkNKUzVXNE5TRExRWTE0IiwidyI6NjM2LCJoIjo4NTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTI5NDUzNDc5MzU0OTI3MzgzMn0.webp");
        bnl0.m105524M(this.f36519s, true);
        this.f36520t.setText(a690VarM143620l != null ? a690VarM143620l.m96294d() : m56009s0(R$string.f28434r6));
    }

    /* JADX INFO: renamed from: W0 */
    public final void m56030W0() {
        a690 a690VarM143620l = j690.m143620l(Privilege.letter);
        this.f36503c.setText(a690VarM143620l.m96314t());
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.kpl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127897a.m56056w0((User) obj);
            }
        }));
        this.f36520t.setText(a690VarM143620l.m96294d());
    }

    /* JADX INFO: renamed from: X0 */
    public final void m56031X0() {
        a690 a690VarM143620l = j690.m143620l(Privilege.vip_letter_gp);
        this.f36503c.setText(a690VarM143620l.m96314t());
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.pol0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153415a.m56057x0((User) obj);
            }
        }));
        this.f36520t.setText(a690VarM143620l.m96294d());
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m56032Y0() {
        a690 a690VarM143620l = j690.m143620l(Privilege.liked_user);
        this.f36503c.setText(a690VarM143620l.m96314t());
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.rol0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164217a.m56058y0((User) obj);
            }
        }));
        this.f36520t.setText(a690VarM143620l.m96294d());
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m56033Z0() {
        a690 a690VarM143620l = j690.m143620l(Privilege.vip_location);
        this.f36503c.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : m56009s0(R$string.f28200X8));
        bnl0.m105524M(this.f36514n, true);
        this.f36505e.setBackgroundResource(jbc0.f119594h);
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.gpl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f105471a.m56059z0((User) obj);
            }
        }));
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText = this.f36520t;
        if (zMo34510h5) {
            vText.setText(a690VarM143620l.m96294d());
        } else {
            vText.setText(R$string.f28404p);
        }
        if (CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            bnl0.m105540X(this.f36505e, qa00.m175859d(6.0f));
            bnl0.m105524M(this.f36504d, true);
            this.f36504d.setText(m56009s0(R$string.f28134R8) + " >");
            this.f36526z.duringCreated(CoreModule.f18264c.f20399k0.f20830R.m159274k()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.hpl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f111030a.m56010A0((RoamedLocationData) obj);
                }
            }));
            this.f36504d.setOnClickListener(new View.OnClickListener() { // from class: l.ipl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116290a.m56011B0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m56034a1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.message_read_state);
        this.f36503c.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : "查看消息已读状态");
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.yol0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200990a.m56012D0((User) obj);
            }
        }));
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText = this.f36520t;
        if (zMo34510h5) {
            vText.setText(a690VarM143620l.m96294d());
        } else {
            vText.setText("显示对方是否看过你的消息\n不再被动苦苦等待");
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m56035d1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.privacy_membership);
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText = this.f36503c;
        if (zMo34510h5) {
            vText.setText(a690VarM143620l.m96314t());
            this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.jpl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122118a.m56013E0((User) obj);
                }
            }));
            this.f36520t.setText(a690VarM143620l.m96294d());
        } else {
            vText.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : "隐私特权");
            m56051q1(CoreModule.m30933P().m143405a().mo34510h5() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlUySERRN1hCRklOWVJQRE1HMjI1Wk03VVFBWU1aSTA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDI5MjY3MDU0OTA5NzM5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlNTM05HS0QzU1oyTTVLSFRZNENEU0ZYN0ZSWTZTMzA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxOTQ2NDI5MjY3MDU0OTA1NjM1LCJhYiI6MH0.png");
            this.f36520t.setText("只对我喜欢的人可见\n隐藏会员身份等");
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m56036e1() {
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText = this.f36503c;
        if (!zMo34510h5) {
            vText.setText("在线闪聊");
            this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.vol0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f185060a.m56015H0((User) obj);
                }
            }));
            this.f36520t.setText("立刻获得神秘配对\n实时互动畅聊无阻！");
        } else {
            vText.setText(CoreModule.m30933P().m143405a().mo34476bk());
            this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.uol0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180102a.m56014G0((User) obj);
                }
            }));
            this.f36520t.setText(String.format(CoreModule.m30933P().m143405a().mo34344Il(), CoreModule.m30933P().m143405a().mo34350Jj()));
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m56037f1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.recover_unmatches);
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText = this.f36503c;
        if (zMo34510h5) {
            vText.setText(a690VarM143620l.m96314t());
            this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.dpl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90066a.m56016I0((User) obj);
                }
            }));
            this.f36520t.setText(a690VarM143620l.m96311q());
        } else {
            vText.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : "找回解除的配对");
            this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.epl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f95258a.m56017J0((User) obj);
                }
            }));
            this.f36520t.setText(a690VarM143620l != null ? a690VarM143620l.m96311q() : "不错过每一次缘分");
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m56038g1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.see_who_likes_me);
        this.f36503c.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : getResources().getString(R$string.f28088N6));
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.zol0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205359a.m56018K0((User) obj);
            }
        }));
        this.f36520t.setText(R$string.f28055K6);
    }

    /* JADX INFO: renamed from: h1 */
    public final void m56039h1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.see_letter_gp);
        this.f36503c.setText(a690VarM143620l.m96314t());
        this.f36520t.setText(a690VarM143620l.m96294d());
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.apl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72731a.m56019L0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j1 */
    public final void m56040j1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.see_theme_unlock_more);
        this.f36503c.setText(a690VarM143620l.m96314t());
        this.f36520t.setText(a690VarM143620l.m96294d());
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.cpl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83005a.m56020M0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k1 */
    public final void m56041k1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.see_theme_unlock_online);
        this.f36503c.setText(a690VarM143620l.m96314t());
        this.f36520t.setText(a690VarM143620l.m96294d());
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.fpl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100202a.m56021N0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l1 */
    public final void m56042l1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.see_theme_unlock_pop);
        this.f36503c.setText(a690VarM143620l.m96314t());
        this.f36520t.setText(a690VarM143620l.m96294d());
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.xol0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195584a.m56022O0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m56043m1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.vip_super_like);
        boolean zMo34737Oi = gta.m132210e().m132214d().mo34737Oi();
        VText vText = this.f36503c;
        if (zMo34737Oi) {
            vText.setText(a690VarM143620l.m96314t());
        } else {
            vText.setText(getContext().getString(R$string.f28246b9, 5));
        }
        bnl0.m105524M(this.f36519s, true);
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.sol0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169902a.m56023P0((User) obj);
            }
        }));
        this.f36505e.setBackgroundResource(jbc0.f119608i);
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText2 = this.f36520t;
        if (zMo34510h5) {
            vText2.setText(a690VarM143620l.m96294d());
        } else {
            vText2.setText(R$string.f28299g2);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m56044n0(View view) {
        lpl0.m155270a(this, view);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m56045n1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.vip_undo);
        this.f36503c.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : m56009s0(R$string.f28222Z8));
        this.f36505e.setBackgroundResource(jbc0.f119622j);
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.tol0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175428a.m56024Q0((User) obj);
            }
        }));
        bnl0.m105524M(this.f36519s, true);
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText = this.f36520t;
        if (zMo34510h5) {
            vText.setText(a690VarM143620l.m96294d());
        } else {
            vText.setText(R$string.f28067L7);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final String m56046o0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IllSS1hPN1VJNTdYNVJLNTRWN09GTzVTWUZBWEZUNjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk1OTUxODY0ODQ5MjA1fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkpZWkdENEFWQkNYRUFBSzVXNFhEM1A3NkJHTFhNNjA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        String strM175820y = q8g0.m175820y();
        if ("ko-KR".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjVYU0xMVEpKSFhaSzRBS1A2SDNBT0daSFg1VFMyVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjJWQkJaVEJLWjY0NVlCUkpBNUpWN1ZDUDdDSUxJSjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IklEN0wzWUg1MkZCNVpaMjRIT0VDVlFDUTdHRVpKVTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMDcxNjY0OTMxNjM3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkdEQUY3UVVQUE1FWlMyTkZIVFlCSjVaRUZFR05SNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ0NzQxMTQ4NjM2ODIwMjczLCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkRWUjQzQ1IzUkVJWU1ON0xJUEE2UzZDSk5VUFBaTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk2MjNIT0FCTzQ0VkRXWE1UNkhHUFg0UFRURTdZWTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxOTAwOTQwMjQzNzYxLCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkZHSkxSN1pWNUpOQ1FHWlRNUzI1V0xMRVpQVEpYMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMjAxODIzOTY4MzU1MTI1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlZWNFRNNUNMUlNSN1YyR0wzUEY0TFhIUDdHWklENDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0MTIxMTMxNTMyMTk2MDY2MDk3LCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlgyUlM1V1NDRExWTkhIRlZDVTVPSVBQSVZHRkVCRjA3IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk1OTUxODY0ODQ5MjA1fQ.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik4zSkIyNUNVQjdWUlEyWEhSS1BCUFVHU1ZUSE42RTA2IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NTc5ODk2MDQ2MDUwMTYxNDQ5fQ.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m56047o1() {
        a690 a690VarM143620l = j690.m143620l(Privilege.vip_unlimited_likes);
        this.f36503c.setText(a690VarM143620l != null ? a690VarM143620l.m96314t() : m56009s0(R$string.f28189W8));
        this.f36505e.setBackgroundResource(jbc0.f119636k);
        this.f36507g.setBackgroundResource(jbc0.f119580g);
        this.f36523w.m153557n(this.f36524x, CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.qol0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158739a.m56025R0((User) obj);
            }
        }));
        bnl0.m105524M(this.f36519s, true);
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        VText vText = this.f36520t;
        if (zMo34510h5) {
            vText.setText(a690VarM143620l.m96294d());
        } else {
            vText.setText(R$string.f27959B9);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56044n0(this);
        if (bnl0.m105588w0() <= 1280) {
            this.f36505e.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 290.0f);
            this.f36505e.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 331.0f);
            ViewGroup.LayoutParams layoutParams = this.f36507g.getLayoutParams();
            int i = f36500A;
            layoutParams.width = i;
            ViewGroup.LayoutParams layoutParams2 = this.f36507g.getLayoutParams();
            int i2 = f36501B;
            layoutParams2.height = i2;
            this.f36508h.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 190.0f);
            this.f36508h.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 190.0f);
            this.f36514n.getLayoutParams().width = i;
            this.f36514n.getLayoutParams().height = i2;
            this.f36519s.getLayoutParams().width = i;
            this.f36519s.getLayoutParams().height = i2;
            this.f36503c.setTextSize(2, bnl0.m105588w0() < 960 ? 16.0f : 18.0f);
            this.f36520t.setTextSize(2, bnl0.m105588w0() < 960 ? 12.0f : 13.0f);
            this.f36515o.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 92.0f);
            this.f36515o.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 98.0f);
            this.f36516p.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 62.0f);
            this.f36516p.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 62.0f);
            this.f36518r.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 14.0f);
            ViewGroup.LayoutParams layoutParams3 = this.f36518r.getLayoutParams();
            int i3 = f36502C;
            layoutParams3.height = i3;
            this.f36517q.setPadding(0, i3, 0, i3);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final String m56048p0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik1SRlZXR0pCRk0yRDREVVIyN0taTlVWMlg2RFpZNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDY5MzMxMzkxNTAxMDk5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5BSVlETVlYSUtKUkJDREw3M1BVN1pDWURMM0pXQzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgyNTg3MDM4MjI2MDAxNzQ3LCJhYiI6MH0.png";
        String strM175820y = q8g0.m175820y();
        if ("ko-KR".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IktSREpJSUpISEpQVkdMVjZVVFlIUlpEMjRPSzdFSDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTI5NDc1LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkYyVldYVDdZQ09WUlE0TU1OTUw3T1NLUllBWDdXUjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTY0NTcyNjM5NzE2NTE5NzQ5LCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVYVjJPVFBJNDZIVDZLVlJIN002QTRKRUxJU0ZGQTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTI5NDgzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjZVQlUyUzJEWDVYVjRHTldCN0Q0R1M1QVlGV1U2UDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mjk0MzU2NjYyMDc0Mjg5OTk3LCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlVBWTVYNFhJWUhTUjRXTVFINklPMllPVzJKQUpISzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTI5NTA3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkVWVkVVWkU3VUhCWk02TkFDRkFFRkFPTExJVE1VWjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1Mjc2MzQyMjYzNTY0ODA4MDQzLCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlJQRFQ1UkVQVUZMVjM0VE9BS1RFSTYzVkVLUkozVjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDc4MTI3NDg0NTIzMzE3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkFSVzRMWkxBTFpLWERBQVlZUzVCUkhPU1FKUTVCSTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgyNTg3MDM4MjI2MDAxNzUzLCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlZUVlM3QjdGSlpUVTdUVEJISEwyVVkzVUhOWk02MzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTcyNDY5MzMxMzkxNTA3MzAzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IksyRjQ0Nk5XWkU2UzNMTkZWQkE2Uk9FN0RQS1hESDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NTgyNTg3MDM4MjI2MDAxNzY5LCJhYiI6MH0.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: p1 */
    public void m56049p1() {
        bnl0.m105524M(this.f36507g, false);
        bnl0.m105524M(this.f36514n, false);
        bnl0.m105524M(this.f36519s, false);
        switch (C9000b.f36528a[this.f36525y.ordinal()]) {
            case 1:
            case 2:
                m56027T0(this.f36525y);
                break;
            case 3:
                m56043m1();
                break;
            case 4:
                m56045n1();
                break;
            case 5:
                m56047o1();
                break;
            case 6:
                m56029V0();
                break;
            case 7:
                m56033Z0();
                break;
            case 8:
                m56034a1();
                break;
            case 9:
                m56026S0();
                break;
            case 10:
                m56030W0();
                break;
            case 11:
                m56035d1();
                break;
            case 12:
                m56037f1();
                break;
            case 13:
                m56038g1();
                break;
            case 14:
                m56036e1();
                break;
            case 15:
                m56028U0();
                break;
            case 16:
                m56032Y0();
                break;
            case 17:
                m56040j1();
                break;
            case 18:
                m56041k1();
                break;
            case 19:
                m56042l1();
                break;
            case 20:
                m56031X0();
                break;
            case 21:
                m56039h1();
                break;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final String m56050q0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkpLRUJHS1JBSTJRNk00N0pPQTc3TzdDNEhYQ05SVDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzU5NzczODEyNjYzNTg5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlhMWkhRU0MyNlFBVUEySzI2U05RVVU3R0FXUEJRWDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzU5ODQyNTMyMTQzOTI1LCJhYiI6MH0.png";
        String strM175820y = q8g0.m175820y();
        if ("ko-KR".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IldOUkJDU0hMVkRMNlhHWDM0SllGWDRFSVlHT1BZQzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzY1OTk4NzA4MDIxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilc1TDVHSlRQVjJJQkZPMlBEQUVaWUFJWldEVFVVQTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzU5NzczODEyNjYzNjA1LCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik00RU9QVTRTS0hVM001TDdVUVYyQU1RTzVKVFJZRTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzY1OTk4NzA4MDIxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ik5UT0xCNVQyM0Y3SUdYSlJRTURKV09RWVlSS0oyUDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzY4NTY5OTA1Njg5Mzk3LCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdTQkdaVUxJM0hNVTNJS1Q0R0VGTjZGVEhRMlIySzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzMxNjM4OTczNzQ5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLNUlUTEdCSTczVTc2SU5ZVFdUU1FYTlVTNFYyNTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3NTM3Nzk3NDAzOTU3LCJhYiI6MH0.png";
        }
        if ("zh-TW".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlZESE5ZR05MTUVIS1ZRQjQ0SlhYVU5WUDVaUTJUNDA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzY4NTY5OTA0NjQxMzMzLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjdOUkhOQjI1NUZONlcyV1NQUktEMkRUUklNS1lZMzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5MzY4NTY5OTA0NjQxMzMzLCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlFGVkdVSUdVVjIyN1c0RDZVR0FUVjRURkZBUks1UiIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzA5OTM3NzM2NTk5ODcwODAwNSwiYWIiOjB9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ilg0Ulc3SEdIRjJPMkhFNlNGRUpNN0I1NUNHVkhGUjA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMDk5Mzc3MzY1OTk4NzA3NDkzLCJhYiI6MH0.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m56051q1(String str) {
        VDraweeView vDraweeView = this.f36506f;
        if (vDraweeView != null) {
            vDraweeView.setImageResource(jbc0.f119636k);
        }
        uqb0.f180374G.m127115L0(this.f36506f, str);
    }

    /* JADX INFO: renamed from: r0 */
    public final String m56052r0(boolean z) {
        String str = z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlNHUFg0V1VLNVhaVVVFWldSN0FSNFRMMzVMWjZaSzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgyMDI3MzY3LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IldUVExPTkdFM1ZUSldOSU5QSldVTFFRUTZYS040NjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY3NTQ3LCJhYiI6MH0.png";
        String strM175820y = q8g0.m175820y();
        if ("ko-KR".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkhOTFpaSjJEV0NHSzc3UkpFVkZXTEo2U1pFQ1dHNTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgwOTc4NzU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjRPN0EyR0VLSlZKV1ZDVlhKN1BGSFpGT04zTlBGQTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTcyNjU1LCJhYiI6MH0.png";
        }
        if ("ja-JP".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkdKUkFDN1hCSERMUTVSUVFIN0pVTVBRWTRLWjMyTzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgyMDI3MzUxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ijc3SVc0Uk5EVEZWRzVLRTVVVVRRQU5PUTZIMlg0TTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY4NTU1LCJhYiI6MH0.png";
        }
        if ("id-ID".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkNJNkZJNzdHMk43SEFIS0ZPSlpFV0ZQWkY1NENHQzA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgwOTc4NzkxLCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6Ikk1UzNLUlpSWUdWVkJGVDMzMlA3VktHNlpQTkRUQjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY3NTc5LCJhYiI6MH0v.png";
        }
        if ("zh-TW".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IjJVVFNVR05HUE9BWTZWNEVUMjdMVE1JVVNGTlZNTjA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NzM4Njc2NTIwMDgyMDI3ODU5LCJhYiI6MH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkM1Vlk2RjJCUjVHRjJHQk1UQkdWVEJQNDJDVFNMTTA1IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY4NTQ3LCJhYiI6MH0.png";
        }
        if ("zh-CN".equals(strM175820y)) {
            return z ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlhGNUtGUEtNNTVNSERRWkFISkw2R0VTTUdBQkpHWSIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzczODY3NjUyMDA4MjAyNzg2MywiYWIiOjB9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IlpVRDJNRldEQjRWREdLWUFWVDdZWEJYSkRBV0RZMjA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTg5NDQwOTcxNDA3OTY4NTUxLCJhYiI6MH0.png";
        }
        return str;
    }

    /* JADX INFO: renamed from: t0 */
    public void m56053t0(PutongFrag putongFrag, C9002a.f fVar, Privilege privilege, Act act, PurchaseType purchaseType) {
        this.f36523w = fVar;
        this.f36524x = putongFrag;
        this.f36525y = privilege;
        this.f36526z = act;
        this.f36522v = purchaseType;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m56054u0(User user) {
        uqb0.f180374G.m127125Q0(this.f36508h, user.m61308fp().profileMiddle());
        this.f36510j.setText(user.name);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m56055v0(boolean z, User user) {
        int i = jbc0.f119249H8;
        int i2 = jbc0.f119235G8;
        VDraweeView vDraweeView = this.f36506f;
        if (!z) {
            i = i2;
        }
        vDraweeView.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m56056w0(User user) {
        if (CoreModule.m30933P().m143405a().mo34510h5()) {
            m56051q1(m56046o0(c17.m107528u0()));
        } else {
            m56051q1(c17.m107528u0() ? "https://auto.tancdn.com/v1/images/eyJpZCI6IlFSVFpFSkVITzNZVDNVUTdBSUxZSVJYMzNIN0tCTiIsInciOjk5MywiaCI6ODcwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzU0NTMwNDAwNDQzODQ4Mzc2NSwiYWIiOjB9.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IkVFUkNYRzJESUFORkZIWDNDUTZFM1FIWFhVWllITjA0IiwidyI6OTkzLCJoIjo4NzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNTQ1MzA0MDk4NjIzNzk2MDA5LCJhYiI6MH0.png");
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m56057x0(User user) {
        m56051q1(CoreModule.f18273l.m143405a().mo34363Lb());
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m56058y0(User user) {
        m56051q1(m56048p0(c17.m107528u0()));
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m56059z0(User user) {
        this.f36516p.setImageUrl(user.m61308fp().url);
    }

    public VipContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36521u = RoamedLocationData.new_();
    }

    public VipContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36521u = RoamedLocationData.new_();
    }
}
