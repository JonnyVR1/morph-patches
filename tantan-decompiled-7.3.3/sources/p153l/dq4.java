package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ExtraInfos;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p051p1.mobile.putong.core.p058ui.verification.CertCenterV2Frag;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.List;
import java.util.Locale;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class dq4 implements iam<rp4> {

    /* JADX INFO: renamed from: A */
    public VText_NoTopPadding f90108A;

    /* JADX INFO: renamed from: B */
    public AutoVDraweeView f90109B;

    /* JADX INFO: renamed from: C */
    public VText_NoTopPadding f90110C;

    /* JADX INFO: renamed from: D */
    public VText_NoTopPadding f90111D;

    /* JADX INFO: renamed from: E */
    public VLinear f90112E;

    /* JADX INFO: renamed from: E0 */
    public VText_NoTopPadding f90113E0;

    /* JADX INFO: renamed from: F */
    public VText_NoTopPadding f90114F;

    /* JADX INFO: renamed from: F0 */
    public VLinear f90115F0;

    /* JADX INFO: renamed from: G */
    public VText_NoTopPadding f90116G;

    /* JADX INFO: renamed from: G0 */
    public VImage f90117G0;

    /* JADX INFO: renamed from: H */
    public VText_NoTopPadding f90118H;

    /* JADX INFO: renamed from: H0 */
    public VText_NoTopPadding f90119H0;

    /* JADX INFO: renamed from: I */
    public VText_NoTopPadding f90120I;

    /* JADX INFO: renamed from: I0 */
    public VImage f90121I0;

    /* JADX INFO: renamed from: J */
    public VLinear f90122J;

    /* JADX INFO: renamed from: J0 */
    public VText_NoTopPadding f90123J0;

    /* JADX INFO: renamed from: K */
    public VRelative f90124K;

    /* JADX INFO: renamed from: K0 */
    public CertCenterV2Frag f90125K0;

    /* JADX INFO: renamed from: L */
    public ImageView f90126L;

    /* JADX INFO: renamed from: L0 */
    public rp4 f90127L0;

    /* JADX INFO: renamed from: M */
    public VText_NoTopPadding f90128M;

    /* JADX INFO: renamed from: N */
    public ImageView f90129N;

    /* JADX INFO: renamed from: O */
    public ImageView f90130O;

    /* JADX INFO: renamed from: P */
    public VText_NoTopPadding f90131P;

    /* JADX INFO: renamed from: Q */
    public ImageView f90132Q;

    /* JADX INFO: renamed from: R */
    public VText_NoTopPadding f90133R;

    /* JADX INFO: renamed from: S */
    public VText_NoTopPadding f90134S;

    /* JADX INFO: renamed from: T */
    public VLinear f90135T;

    /* JADX INFO: renamed from: U */
    public VImage f90136U;

    /* JADX INFO: renamed from: V */
    public VText_NoTopPadding f90137V;

    /* JADX INFO: renamed from: W */
    public VImage f90138W;

    /* JADX INFO: renamed from: X */
    public VText_NoTopPadding f90139X;

    /* JADX INFO: renamed from: Y */
    public VLinear f90140Y;

    /* JADX INFO: renamed from: Z */
    public VImage f90141Z;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f90142a;

    /* JADX INFO: renamed from: b */
    public VImage f90143b;

    /* JADX INFO: renamed from: c */
    public VText f90144c;

    /* JADX INFO: renamed from: d */
    public VLinear f90145d;

    /* JADX INFO: renamed from: e */
    public VImage f90146e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f90147f;

    /* JADX INFO: renamed from: g */
    public VText_NoTopPadding f90148g;

    /* JADX INFO: renamed from: h */
    public VImage f90149h;

    /* JADX INFO: renamed from: i */
    public SimpleDraweeView f90150i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f90151j;

    /* JADX INFO: renamed from: k */
    public VLinear f90152k;

    /* JADX INFO: renamed from: k0 */
    public VText_NoTopPadding f90153k0;

    /* JADX INFO: renamed from: l */
    public VText f90154l;

    /* JADX INFO: renamed from: m */
    public VLinear f90155m;

    /* JADX INFO: renamed from: n */
    public VLinear f90156n;

    /* JADX INFO: renamed from: o */
    public VText f90157o;

    /* JADX INFO: renamed from: p */
    public VText f90158p;

    /* JADX INFO: renamed from: p0 */
    public VImage f90159p0;

    /* JADX INFO: renamed from: q */
    public VRecyclerView f90160q;

    /* JADX INFO: renamed from: r */
    public VRecyclerView f90161r;

    /* JADX INFO: renamed from: s */
    public VText f90162s;

    /* JADX INFO: renamed from: t */
    public VText f90163t;

    /* JADX INFO: renamed from: u */
    public VLinear f90164u;

    /* JADX INFO: renamed from: v */
    public AutoVDraweeView f90165v;

    /* JADX INFO: renamed from: w */
    public VText_NoTopPadding f90166w;

    /* JADX INFO: renamed from: x */
    public AutoVDraweeView f90167x;

    /* JADX INFO: renamed from: y */
    public VText_NoTopPadding f90168y;

    /* JADX INFO: renamed from: z */
    public AutoVDraweeView f90169z;

    /* JADX INFO: renamed from: l.dq4$a */
    public static /* synthetic */ class C16602a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90170a;

        static {
            int[] iArr = new int[IdentifyView.TipType.values().length];
            f90170a = iArr;
            try {
                iArr[IdentifyView.TipType.INVITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90170a[IdentifyView.TipType.ONLY_CERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90170a[IdentifyView.TipType.SWIPE_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.dq4$b */
    public class C16603b extends jic0<Pair<Integer, String>> {

        /* JADX INFO: renamed from: c */
        public final List<Pair<Integer, String>> f90171c;

        public C16603b(List<Pair<Integer, String>> list) {
            this.f90171c = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m117488H(int i, View view) {
            dq4.this.f90127L0.m182505r0(i);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f90171c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(dq4.this.getAct()).inflate(kec0.f125721Z0, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, Pair<Integer, String> pair, int i, final int i2) {
            VImage vImage = (VImage) view.findViewById(adc0.f70621w5);
            VText_NoTopPadding vText_NoTopPadding = (VText_NoTopPadding) view.findViewById(adc0.f70061P1);
            vImage.setImageDrawable(App.f16088e.getDrawable(((Integer) pair.first).intValue()));
            vText_NoTopPadding.setText((CharSequence) pair.second);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.eq4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f95298a.m117488H(i2, view2);
                }
            });
            if (gra.m131731p2()) {
                vText_NoTopPadding.setTextColor(Color.parseColor("#66000000"));
                ((VImage) view.findViewById(adc0.f69991L)).setImageResource(dbc0.f86429O4);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> getItem(int i) {
            return this.f90171c.get(i);
        }
    }

    public dq4(CertCenterV2Frag certCenterV2Frag) {
        this.f90125K0 = certCenterV2Frag;
    }

    /* JADX INFO: renamed from: A */
    private void m117444A() {
        ((PutongAct) getAct()).setTransparentStatusBar();
        PutongAct.setLightStatusBar(getAct().getWindow(), 1024);
        getAct().getWindow().addFlags(Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m117445F(View view) {
        this.f90127L0.m182504q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m117446J(View view) {
        this.f90127L0.m182502o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m117447K(View view) {
        bnl0.m105524M(this.f90120I, false);
        bnl0.m105524M(this.f90122J, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m117448L(View view) {
        bnl0.m105524M(this.f90120I, true);
        bnl0.m105524M(this.f90122J, false);
    }

    /* JADX INFO: renamed from: w */
    private void m117461w() {
        bnl0.m105509E0(this.f90111D, new View.OnClickListener() { // from class: l.vp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185211a.m117466G(view);
            }
        });
        bnl0.m105509E0(this.f90135T, new View.OnClickListener() { // from class: l.wp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190253a.m117467H(view);
            }
        });
        bnl0.m105509E0(this.f90115F0, new View.OnClickListener() { // from class: l.xp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195683a.m117468I(view);
            }
        });
        bnl0.m105509E0(this.f90140Y, new View.OnClickListener() { // from class: l.yp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201040a.m117446J(view);
            }
        });
        bnl0.m105509E0(this.f90120I, new View.OnClickListener() { // from class: l.zp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205420a.m117447K(view);
            }
        });
        bnl0.m105509E0(this.f90134S, new View.OnClickListener() { // from class: l.aq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72784a.m117448L(view);
            }
        });
        bnl0.m105509E0(this.f90124K, new View.OnClickListener() { // from class: l.bq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77853a.m117445F(view);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    private void m117462y() {
        this.f90142a.setLeftIconAsBack(getAct());
        this.f90142a.setTitle(getAct().string(R$string.f18654Lr));
        this.f90142a.setBackgroundColor(Color.parseColor("#F8F8F8"));
        bnl0.m105540X(this.f90142a, vnb.m201954n1(getAct()) + qa00.m175859d(6.0f));
    }

    /* JADX INFO: renamed from: B */
    public final void m117463B() {
        m117483u(jyb.m147507f0("res://" + getContext().getPackageName() + "/" + dbc0.f87044h5), qa00.m175859d(42.0f), 0, 0);
        this.f90157o.setText("完成认证，提升每日右滑上限");
        this.f90158p.setText("每天可额外发出10次喜欢");
    }

    /* JADX INFO: renamed from: C */
    public final void m117464C() {
        MyTabTask myTabTask = (MyTabTask) jyb.m147529r(CoreModule.f18264c.f20381e0.f89253i7.m222761e(), new qcj() { // from class: l.cq4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("verification".equals(((MyTabTask) obj).type));
            }
        });
        if (NullChecker.m82486a(myTabTask)) {
            List<String> listM147517k0 = jyb.m147517k0(myTabTask.avatarGroups.get(0).avatars, 2);
            if (!jyb.m147479J(listM147517k0)) {
                m117483u(listM147517k0, qa00.m175859d(listM147517k0.size() > 1 ? 42.0f : 36.0f), qa00.m175859d(2.0f), Color.parseColor("#F7F7F7"));
            }
        }
        VText vText = this.f90157o;
        Locale locale = Locale.CHINA;
        vText.setText(String.format(locale, "完成认证，立即收到%s的喜欢", (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116600p9().settings) && TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().settings.getLookingFor(), "female")) ? "她们" : "他们"));
        this.f90158p.setText(String.format(locale, "%d人邀请你认证，通过后自动喜欢你", CoreModule.f18264c.f20381e0.f89285m7.get()));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f90125K0.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m117465E() {
        MyTabTask myTabTask = (MyTabTask) jyb.m147529r(CoreModule.f18264c.f20381e0.f89253i7.m222761e(), new qcj() { // from class: l.tp4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("verification".equals(((MyTabTask) obj).type));
            }
        });
        if (NullChecker.m82486a(myTabTask)) {
            ExtraInfos extraInfos = myTabTask.extraInfos;
            if (extraInfos.trialLikedCount <= 0 || jyb.m147479J(extraInfos.trialLikedAvatars)) {
                return;
            }
            List<String> listM147517k0 = jyb.m147517k0(myTabTask.extraInfos.trialLikedAvatars, 2);
            m117483u(listM147517k0, qa00.m175859d(listM147517k0.size() > 1 ? 42.0f : 36.0f), qa00.m175859d(2.0f), Color.parseColor("#F7F7F7"));
            this.f90157o.setText("完成认证，解锁“只看认证”功能");
            this.f90158p.setText(String.format(Locale.CHINA, "试用时喜欢的%d人才能看到你", Integer.valueOf(myTabTask.extraInfos.trialLikedCount)));
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m117466G(View view) {
        this.f90127L0.m182501n0();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m117467H(View view) {
        this.f90127L0.m182503p0();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m117468I(View view) {
        this.f90127L0.m182506s0();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m117469M(View view) {
        bnl0.m105524M(this.f90162s, false);
        bnl0.m105524M(this.f90163t, true);
        bnl0.m105524M(this.f90161r, true);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m117470N(View view) {
        bnl0.m105524M(this.f90162s, true);
        bnl0.m105524M(this.f90163t, false);
        bnl0.m105524M(this.f90161r, false);
    }

    /* JADX INFO: renamed from: O */
    public final void m117471O() {
        this.f90145d.setClipToOutline(true);
        this.f90160q.setAdapter(new C16603b(gra.m131778z() ? jyb.m147507f0(Pair.create(Integer.valueOf(dbc0.f86141F4), "更多右滑"), Pair.create(Integer.valueOf(dbc0.f86205H4), "优先推荐"), Pair.create(Integer.valueOf(dbc0.f86269J4), "认证标识"), Pair.create(Integer.valueOf(dbc0.f86333L4), "高阶隐私设置"), Pair.create(Integer.valueOf(dbc0.f86397N4), "只看认证")) : jyb.m147507f0(Pair.create(Integer.valueOf(dbc0.f86109E4), "更多右滑"), Pair.create(Integer.valueOf(dbc0.f86173G4), "优先推荐"), Pair.create(Integer.valueOf(dbc0.f86237I4), "认证标识"), Pair.create(Integer.valueOf(dbc0.f86301K4), "高阶隐私设置"), Pair.create(Integer.valueOf(dbc0.f86365M4), "只看认证"))));
        this.f90165v.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkRHUjRCT0UyT0NOTUVDV0lRS0xBTjRURVJYSlc1VDE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjE5NTM4MTc4NjM3NzE0NTE1fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkkzMlpRRFRUUklWSE5WMkhSSlZCS0FIR0FTVzQyWjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTAyMDQ4Nzk1MzA1ODIyNzM5fQ.webp");
        this.f90167x.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IllYNVBBM0pFVUtaSEZBUUVaRVdGV0FVUUtEUzJHUzE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MDA1MTY2NTUzNjYzOTQ5MzU4fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklUUEREUTJUUUhWWVVBT0JZUTY1M0pBNUFLWVRXUjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjYzMzcxNzc5ODA2NDg0MjAzOX0.webp");
        this.f90169z.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkJURlY0QTNJUFNPVVQ2TFZRWFE3V05ZRkhaWURINDE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjYxOTQyOTE1NjQ1NzcyMzAxfQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklNN1VLRlhMQTdLRlBWU0VJSjNBVks0NUVFSkFHVzE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MzY2MjQ4NDM4NTI0MTg3NDQ3fQ.webp");
        this.f90109B.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IldOTUVDMldXTExFWFBKS0FHTE5FTjVDNE81SU1DSTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjU1NzQ3MTA1ODE3OTMyNzM5OH0.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjZWSFpJQUIzV0dVUExBRExRRUE1RjJKQkFFRzdLVDE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjYwMTU4NDMzMTk4MzY4MTA4fQ.webp");
        int iM105592y0 = (((bnl0.m105592y0() - qa00.m175859d(64.0f)) * 96) / 78) / 4;
        bnl0.m105505C0(this.f90165v, iM105592y0);
        bnl0.m105505C0(this.f90167x, iM105592y0);
        bnl0.m105505C0(this.f90169z, iM105592y0);
        bnl0.m105505C0(this.f90109B, iM105592y0);
        if ("expand_privilege".equals(getAct().getIntent().getStringExtra("action"))) {
            bnl0.m105524M(this.f90120I, false);
            bnl0.m105524M(this.f90122J, true);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m117472P(StudentVerificationStatus studentVerificationStatus) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        User userM116589ma = CoreModule.f18264c.f20381e0.m116589ma();
        if (userM116600p9 == null || userM116589ma == null) {
            return;
        }
        boolean zEquals = TEnum.equals(studentVerificationStatus, "verified");
        VText_NoTopPadding vText_NoTopPadding = this.f90147f;
        if (zEquals) {
            vText_NoTopPadding.setText("头像本人认证通过");
            this.f90148g.setText("认证通过，权益生效中");
            this.f90145d.setBackground(tu0.m192702b(getContext(), dbc0.f86461P4));
            this.f90149h.setImageDrawable(tu0.m192702b(getContext(), dbc0.f86621U4));
            this.f90151j.setText("头像本人");
            this.f90151j.setBackgroundDrawable(tu0.m192702b(getContext(), dbc0.f86013B4));
            this.f90151j.setCompoundDrawablesWithIntrinsicBounds(gra.m131778z() ? dbc0.f86077D4 : dbc0.f86045C4, 0, 0, 0);
            bnl0.m105524M(this.f90151j, true);
            bnl0.m105524M(this.f90152k, false);
            bnl0.m105524M(this.f90112E, true);
            this.f90150i.setImageURI(userM116600p9.m61308fp().profile480().formatted());
            return;
        }
        vText_NoTopPadding.setText("头像本人认证");
        this.f90148g.setText("使用五官清晰正面照完成认证");
        this.f90145d.setBackground(tu0.m192702b(getContext(), dbc0.f87077i5));
        this.f90149h.setImageDrawable(tu0.m192702b(getContext(), dbc0.f86589T4));
        if (userM116600p9.isFakeUser() || userM116600p9.m61308fp().isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK))) {
            this.f90151j.setText("认证成功率低");
            this.f90151j.setBackgroundDrawable(tu0.m192702b(getContext(), dbc0.f85981A4));
            this.f90151j.setCompoundDrawablesWithIntrinsicBounds(gra.m131778z() ? dbc0.f86009B0 : dbc0.f85977A0, 0, 0, 0);
            bnl0.m105524M(this.f90151j, true);
        } else {
            bnl0.m105524M(this.f90151j, false);
        }
        bnl0.m105524M(this.f90152k, true);
        bnl0.m105524M(this.f90112E, false);
        this.f90150i.setImageURI(userM116589ma.m61308fp().url);
        m117473Q(studentVerificationStatus);
    }

    /* JADX INFO: renamed from: Q */
    public final void m117473Q(StudentVerificationStatus studentVerificationStatus) {
        User userM116589ma = CoreModule.f18264c.f20381e0.m116589ma();
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f90111D.setText("认证失败，重新尝试");
            this.f90111D.setTextColor(Color.parseColor("#FFFFFF"));
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f90111D.setText("审核中...");
            this.f90111D.setTextColor(Color.parseColor("#66FFFFFF"));
        } else if (userM116589ma.isFakeUser() || userM116589ma.m61308fp().isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK))) {
            this.f90111D.setText("更换照片，完成认证");
            this.f90111D.setTextColor(Color.parseColor("#FFFFFFFF"));
        } else {
            this.f90111D.setText("立即认证，获得特权");
            this.f90111D.setTextColor(Color.parseColor("#FFFFFFFF"));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m117474R(int i, int i2, int i3) {
        this.f90114F.setText(m117482s(i, "次"));
        this.f90116G.setText(m117482s(i2, "人"));
        this.f90118H.setText(m117482s(i3, "人"));
    }

    /* JADX INFO: renamed from: S */
    public void m117475S(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f90113E0.setText("已认证");
                this.f90113E0.setTextColor(Color.parseColor("#66000000"));
                bnl0.m105524M(this.f90159p0, false);
                bnl0.m105524M(this.f90113E0, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText_NoTopPadding vText_NoTopPadding = this.f90113E0;
            if (zEquals) {
                vText_NoTopPadding.setText("审核中");
                this.f90113E0.setTextColor(Color.parseColor("#66000000"));
                bnl0.m105524M(this.f90159p0, false);
                bnl0.m105524M(this.f90113E0, true);
                return;
            }
            vText_NoTopPadding.setText("待激活");
            this.f90113E0.setTextColor(Color.parseColor("#FE7E1D"));
            bnl0.m105524M(this.f90159p0, false);
            bnl0.m105524M(this.f90113E0, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f90113E0.setText("审核中");
            this.f90113E0.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f90159p0, false);
            bnl0.m105524M(this.f90113E0, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f90113E0.setText("认证失败");
            this.f90113E0.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f90159p0, false);
            bnl0.m105524M(this.f90113E0, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            bnl0.m105524M(this.f90159p0, true);
            bnl0.m105524M(this.f90113E0, false);
        } else {
            this.f90113E0.setText("已失效");
            this.f90113E0.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f90159p0, false);
            bnl0.m105524M(this.f90113E0, true);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m117476T(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f90139X.setText("已认证");
                this.f90139X.setTextColor(Color.parseColor("#66000000"));
                bnl0.m105524M(this.f90138W, false);
                bnl0.m105524M(this.f90139X, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText_NoTopPadding vText_NoTopPadding = this.f90139X;
            if (zEquals) {
                vText_NoTopPadding.setText("审核中");
                this.f90139X.setTextColor(Color.parseColor("#66000000"));
                bnl0.m105524M(this.f90138W, false);
                bnl0.m105524M(this.f90139X, true);
                return;
            }
            vText_NoTopPadding.setText("待激活");
            this.f90139X.setTextColor(Color.parseColor("#FF700A"));
            bnl0.m105524M(this.f90138W, false);
            bnl0.m105524M(this.f90139X, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f90139X.setText("认证失败");
            this.f90139X.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f90138W, false);
            bnl0.m105524M(this.f90139X, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f90139X.setText("审核中");
            this.f90139X.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f90138W, false);
            bnl0.m105524M(this.f90139X, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            bnl0.m105524M(this.f90138W, true);
            bnl0.m105524M(this.f90139X, false);
        } else {
            this.f90139X.setText("已失效");
            this.f90139X.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f90138W, false);
            bnl0.m105524M(this.f90139X, true);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m117477U(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            this.f90123J0.setText("已认证");
            bnl0.m105524M(this.f90121I0, false);
            bnl0.m105524M(this.f90123J0, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f90123J0.setText("认证失败");
            bnl0.m105524M(this.f90121I0, false);
            bnl0.m105524M(this.f90123J0, true);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f90123J0.setText("审核中");
            bnl0.m105524M(this.f90121I0, false);
            bnl0.m105524M(this.f90123J0, true);
        } else if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            bnl0.m105524M(this.f90121I0, true);
            bnl0.m105524M(this.f90123J0, false);
        } else {
            this.f90123J0.setText("已失效");
            bnl0.m105524M(this.f90121I0, false);
            bnl0.m105524M(this.f90123J0, true);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m117478V(boolean z) {
        bnl0.m105524M(this.f90115F0, z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m117479p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public View m117479p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fq4.m126730b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rp4 rp4Var) {
        this.f90127L0 = rp4Var;
    }

    /* JADX INFO: renamed from: r */
    public void m117481r() {
        m117444A();
        m117462y();
        m117471O();
        m117461w();
        m117485x();
        if (gra.m131778z()) {
            m117486z();
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m117482s(int i, String str) {
        return i >= 10000 ? String.format("%.1fw%s", Double.valueOf(Math.round(((double) i) / 1000.0d) / 10.0d), str) : String.format("%d%s", Integer.valueOf(i), str);
    }

    /* JADX INFO: renamed from: u */
    public final void m117483u(List<String> list, int i, int i2, int i3) {
        this.f90156n.removeAllViews();
        m117484v(list, this.f90156n, i, qa00.f156323j, i2, (list.size() == 1 && list.get(0).startsWith(ShareConstants.RES_PATH)) ? 0 : i3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: v */
    public final void m117484v(List<String> list, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        for (String str : list) {
            VDraweeView vDraweeView = new VDraweeView(getAct());
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8322v(true);
            ((wlj) vDraweeView.getHierarchy()).m207045H(roundingParams);
            if (i4 != 0) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(i4);
                vDraweeView.setBackground(shapeDrawable);
                vDraweeView.setPadding(i3, i3, i3, i3);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            if (viewGroup.getChildCount() > 0) {
                layoutParams.leftMargin = -i2;
            }
            viewGroup.addView(vDraweeView, layoutParams);
            uqb0.f180374G.m127109I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m117485x() {
        if (gra.m131731p2()) {
            this.f90161r.setAdapter(new C16603b(jyb.m147507f0(Pair.create(Integer.valueOf(dbc0.f86109E4), "更多右滑"), Pair.create(Integer.valueOf(dbc0.f86173G4), "优先推荐"), Pair.create(Integer.valueOf(dbc0.f86237I4), "认证标识"), Pair.create(Integer.valueOf(dbc0.f86301K4), "高阶隐私设置"), Pair.create(Integer.valueOf(dbc0.f86365M4), "只看认证"))));
            bnl0.m105509E0(this.f90162s, new View.OnClickListener() { // from class: l.sp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f170012a.m117469M(view);
                }
            });
            bnl0.m105509E0(this.f90163t, new View.OnClickListener() { // from class: l.up4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180215a.m117470N(view);
                }
            });
            String stringExtra = getAct().getIntent().getStringExtra("tip_type");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            bnl0.m105540X(this.f90164u, qa00.m175859d(26.0f));
            bnl0.m105524M(this.f90155m, true);
            bnl0.m105524M(this.f90162s, true);
            bnl0.m105524M(this.f90160q, false);
            this.f90154l.setText("完成认证后，解锁多项权益");
            int i = C16602a.f90170a[IdentifyView.TipType.valueOf(stringExtra).ordinal()];
            if (i == 1) {
                m117464C();
            } else if (i == 2) {
                m117465E();
            } else {
                if (i != 3) {
                    return;
                }
                m117463B();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m117486z() {
        this.f90142a.setLeftIconResource(dbc0.f86282Jh);
        this.f90144c.setTextColor(Color.parseColor("#66000000"));
        this.f90146e.setImageResource(dbc0.f87630z4);
        this.f90166w.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87220mi, 0, 0, 0);
        this.f90168y.setCompoundDrawablesWithIntrinsicBounds(dbc0.f87220mi, 0, 0, 0);
        this.f90108A.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86041C0, 0, 0, 0);
        this.f90110C.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86041C0, 0, 0, 0);
        this.f90111D.setBackgroundResource(dbc0.f86314Kh);
        this.f90126L.setImageResource(dbc0.f86685W4);
        this.f90130O.setImageResource(dbc0.f86717X4);
        this.f90132Q.setImageResource(dbc0.f86749Y4);
        this.f90129N.setImageResource(dbc0.f87598y4);
        this.f90134S.setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86653V4, 0);
        this.f90120I.setCompoundDrawablesWithIntrinsicBounds(0, 0, dbc0.f86781Z4, 0);
        this.f90137V.setTextColor(Color.parseColor(Constants.BLACK));
        this.f90138W.setImageResource(dbc0.f87598y4);
        this.f90153k0.setTextColor(Color.parseColor(Constants.BLACK));
        this.f90159p0.setImageResource(dbc0.f87598y4);
        this.f90119H0.setTextColor(Color.parseColor(Constants.BLACK));
        this.f90121I0.setImageResource(dbc0.f87598y4);
        this.f90136U.setImageResource(dbc0.f86847b5);
        this.f90117G0.setImageResource(dbc0.f86978f5);
        this.f90141Z.setImageResource(dbc0.f86814a5);
        this.f90143b.setImageResource(dbc0.f87011g5);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
