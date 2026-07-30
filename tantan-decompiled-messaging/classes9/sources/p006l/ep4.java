package p006l;

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
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.CertCenterV2Frag;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.data.ExtraInfos;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.data.TaskAvatarDesc;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import l.dac0;
import l.gp4;
import l.hmb;
import l.nu0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VRelative;
import v.VText;
import v.VText_NoTopPadding;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ep4 implements s7m<so4> {

    /* JADX INFO: renamed from: A */
    public VText_NoTopPadding f11317A;

    /* JADX INFO: renamed from: B */
    public AutoVDraweeView f11318B;

    /* JADX INFO: renamed from: C */
    public VText_NoTopPadding f11319C;

    /* JADX INFO: renamed from: D */
    public VText_NoTopPadding f11320D;

    /* JADX INFO: renamed from: E */
    public VLinear f11321E;

    /* JADX INFO: renamed from: E0 */
    public VText_NoTopPadding f11322E0;

    /* JADX INFO: renamed from: F */
    public VText_NoTopPadding f11323F;

    /* JADX INFO: renamed from: F0 */
    public VLinear f11324F0;

    /* JADX INFO: renamed from: G */
    public VText_NoTopPadding f11325G;

    /* JADX INFO: renamed from: G0 */
    public VImage f11326G0;

    /* JADX INFO: renamed from: H */
    public VText_NoTopPadding f11327H;

    /* JADX INFO: renamed from: H0 */
    public VText_NoTopPadding f11328H0;

    /* JADX INFO: renamed from: I */
    public VText_NoTopPadding f11329I;

    /* JADX INFO: renamed from: I0 */
    public VImage f11330I0;

    /* JADX INFO: renamed from: J */
    public VLinear f11331J;

    /* JADX INFO: renamed from: J0 */
    public VText_NoTopPadding f11332J0;

    /* JADX INFO: renamed from: K */
    public VRelative f11333K;

    /* JADX INFO: renamed from: K0 */
    public CertCenterV2Frag f11334K0;

    /* JADX INFO: renamed from: L */
    public ImageView f11335L;

    /* JADX INFO: renamed from: L0 */
    public so4 f11336L0;

    /* JADX INFO: renamed from: M */
    public VText_NoTopPadding f11337M;

    /* JADX INFO: renamed from: N */
    public ImageView f11338N;

    /* JADX INFO: renamed from: O */
    public ImageView f11339O;

    /* JADX INFO: renamed from: P */
    public VText_NoTopPadding f11340P;

    /* JADX INFO: renamed from: Q */
    public ImageView f11341Q;

    /* JADX INFO: renamed from: R */
    public VText_NoTopPadding f11342R;

    /* JADX INFO: renamed from: S */
    public VText_NoTopPadding f11343S;

    /* JADX INFO: renamed from: T */
    public VLinear f11344T;

    /* JADX INFO: renamed from: U */
    public VImage f11345U;

    /* JADX INFO: renamed from: V */
    public VText_NoTopPadding f11346V;

    /* JADX INFO: renamed from: W */
    public VImage f11347W;

    /* JADX INFO: renamed from: X */
    public VText_NoTopPadding f11348X;

    /* JADX INFO: renamed from: Y */
    public VLinear f11349Y;

    /* JADX INFO: renamed from: Z */
    public VImage f11350Z;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f11351a;

    /* JADX INFO: renamed from: b */
    public VImage f11352b;

    /* JADX INFO: renamed from: c */
    public VText f11353c;

    /* JADX INFO: renamed from: d */
    public VLinear f11354d;

    /* JADX INFO: renamed from: e */
    public VImage f11355e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f11356f;

    /* JADX INFO: renamed from: g */
    public VText_NoTopPadding f11357g;

    /* JADX INFO: renamed from: h */
    public VImage f11358h;

    /* JADX INFO: renamed from: i */
    public SimpleDraweeView f11359i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f11360j;

    /* JADX INFO: renamed from: k */
    public VLinear f11361k;

    /* JADX INFO: renamed from: k0 */
    public VText_NoTopPadding f11362k0;

    /* JADX INFO: renamed from: l */
    public VText f11363l;

    /* JADX INFO: renamed from: m */
    public VLinear f11364m;

    /* JADX INFO: renamed from: n */
    public VLinear f11365n;

    /* JADX INFO: renamed from: o */
    public VText f11366o;

    /* JADX INFO: renamed from: p */
    public VText f11367p;

    /* JADX INFO: renamed from: p0 */
    public VImage f11368p0;

    /* JADX INFO: renamed from: q */
    public VRecyclerView f11369q;

    /* JADX INFO: renamed from: r */
    public VRecyclerView f11370r;

    /* JADX INFO: renamed from: s */
    public VText f11371s;

    /* JADX INFO: renamed from: t */
    public VText f11372t;

    /* JADX INFO: renamed from: u */
    public VLinear f11373u;

    /* JADX INFO: renamed from: v */
    public AutoVDraweeView f11374v;

    /* JADX INFO: renamed from: w */
    public VText_NoTopPadding f11375w;

    /* JADX INFO: renamed from: x */
    public AutoVDraweeView f11376x;

    /* JADX INFO: renamed from: y */
    public VText_NoTopPadding f11377y;

    /* JADX INFO: renamed from: z */
    public AutoVDraweeView f11378z;

    /* JADX INFO: renamed from: l.ep4$a */
    public static /* synthetic */ class C0684a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11379a;

        static {
            int[] iArr = new int[IdentifyView.TipType.values().length];
            f11379a = iArr;
            try {
                iArr[IdentifyView.TipType.INVITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11379a[IdentifyView.TipType.ONLY_CERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11379a[IdentifyView.TipType.SWIPE_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.ep4$b */
    public class C0685b extends dac0<Pair<Integer, String>> {

        /* JADX INFO: renamed from: c */
        public final List<Pair<Integer, String>> f11380c;

        public C0685b(List<Pair<Integer, String>> list) {
            this.f11380c = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m14801H(int i, View view) {
            ep4.this.f11336L0.m23946r0(i);
        }

        /* JADX INFO: renamed from: C */
        public int m14803C() {
            return this.f11380c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m14804D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(ep4.this.act()).inflate(f6c0.f12081Z0, viewGroup, false);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m14802A(View view, Pair<Integer, String> pair, int i, final int i2) {
            VImage vImageFindViewById = view.findViewById(u4c0.f23244u5);
            VText_NoTopPadding vText_NoTopPaddingFindViewById = view.findViewById(u4c0.f22721P1);
            vImageFindViewById.setImageDrawable(App.e.getDrawable(((Integer) pair.first).intValue()));
            vText_NoTopPaddingFindViewById.setText((CharSequence) pair.second);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.fp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f12825a.m14801H(i2, view2);
                }
            });
            if (upa.m25498p2()) {
                vText_NoTopPaddingFindViewById.setTextColor(Color.parseColor("#66000000"));
                view.findViewById(u4c0.f22651L).setImageResource(x2c0.f26103N4);
            }
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> getItem(int i) {
            return this.f11380c.get(i);
        }
    }

    public ep4(CertCenterV2Frag certCenterV2Frag) {
        this.f11334K0 = certCenterV2Frag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m14755F(View view) {
        this.f11336L0.m23945q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m14756J(View view) {
        this.f11336L0.m23943o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m14757K(View view) {
        xdl0.M(this.f11329I, false);
        xdl0.M(this.f11331J, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m14758L(View view) {
        xdl0.M(this.f11329I, true);
        xdl0.M(this.f11331J, false);
    }

    /* JADX INFO: renamed from: w */
    private void m14771w() {
        xdl0.E0(this.f11320D, new View.OnClickListener() { // from class: l.wo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25263a.m14778G(view);
            }
        });
        xdl0.E0(this.f11344T, new View.OnClickListener() { // from class: l.xo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27632a.m14779H(view);
            }
        });
        xdl0.E0(this.f11324F0, new View.OnClickListener() { // from class: l.yo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28316a.m14780I(view);
            }
        });
        xdl0.E0(this.f11349Y, new View.OnClickListener() { // from class: l.zo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28858a.m14756J(view);
            }
        });
        xdl0.E0(this.f11329I, new View.OnClickListener() { // from class: l.ap4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8433a.m14757K(view);
            }
        });
        xdl0.E0(this.f11343S, new View.OnClickListener() { // from class: l.bp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9020a.m14758L(view);
            }
        });
        xdl0.E0(this.f11333K, new View.OnClickListener() { // from class: l.cp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9772a.m14755F(view);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    private void m14772y() {
        this.f11351a.setLeftIconAsBack(act());
        this.f11351a.setTitle(act().string(R$string.f2825pr));
        this.f11351a.setBackgroundColor(Color.parseColor("#F8F8F8"));
        xdl0.X(this.f11351a, hmb.n1(act()) + t100.d(6.0f));
    }

    /* JADX INFO: renamed from: A */
    public final void m14773A() {
        ((PutongAct) act()).setTransparentStatusBar();
        PutongAct.setLightStatusBar(act().getWindow(), 1024);
        act().getWindow().addFlags(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: B */
    public final void m14774B() {
        m14796u(vwb.f0(new String[]{"res://" + m14776C0().getPackageName() + "/" + x2c0.f26698g5}), t100.d(42.0f), 0, 0);
        this.f11366o.setText("完成认证，提升每日右滑上限");
        this.f11367p.setText("每天可额外发出10次喜欢");
    }

    /* JADX INFO: renamed from: C */
    public final void m14775C() {
        MyTabTask myTabTask = (MyTabTask) vwb.r((Collection) CoreModule.f1534c.f3628e0.f19008i7.e(), new w9j() { // from class: l.dp4
            public final Object call(Object obj) {
                return Boolean.valueOf("verification".equals(((MyTabTask) obj).type));
            }
        });
        if (NullChecker.a(myTabTask)) {
            List<String> listK0 = vwb.k0(((TaskAvatarDesc) myTabTask.avatarGroups.get(0)).avatars, 2);
            if (!vwb.J(listK0)) {
                m14796u(listK0, t100.d(listK0.size() > 1 ? 42.0f : 36.0f), t100.d(2.0f), Color.parseColor("#F7F7F7"));
            }
        }
        VText vText = this.f11366o;
        Locale locale = Locale.CHINA;
        vText.setText(String.format(locale, "完成认证，立即收到%s的喜欢", (NullChecker.a(CoreModule.f1534c.f3628e0.m21490p9().settings) && TEnum.equals(CoreModule.f1534c.f3628e0.m21490p9().settings.getLookingFor(), "female")) ? "她们" : "他们"));
        this.f11367p.setText(String.format(locale, "%d人邀请你认证，通过后自动喜欢你", CoreModule.f1534c.f3628e0.f19040m7.get()));
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14776C0() {
        return this.f11334K0.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m14777E() {
        MyTabTask myTabTask = (MyTabTask) vwb.r((Collection) CoreModule.f1534c.f3628e0.f19008i7.e(), new w9j() { // from class: l.uo4
            public final Object call(Object obj) {
                return Boolean.valueOf("verification".equals(((MyTabTask) obj).type));
            }
        });
        if (NullChecker.a(myTabTask)) {
            ExtraInfos extraInfos = myTabTask.extraInfos;
            if (extraInfos.trialLikedCount <= 0 || vwb.J(extraInfos.trialLikedAvatars)) {
                return;
            }
            List<String> listK0 = vwb.k0(myTabTask.extraInfos.trialLikedAvatars, 2);
            m14796u(listK0, t100.d(listK0.size() > 1 ? 42.0f : 36.0f), t100.d(2.0f), Color.parseColor("#F7F7F7"));
            this.f11366o.setText("完成认证，解锁“只看认证”功能");
            this.f11367p.setText(String.format(Locale.CHINA, "试用时喜欢的%d人才能看到你", Integer.valueOf(myTabTask.extraInfos.trialLikedCount)));
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m14778G(View view) {
        this.f11336L0.m23942n0();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m14779H(View view) {
        this.f11336L0.m23944p0();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m14780I(View view) {
        this.f11336L0.m23947s0();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m14781M(View view) {
        xdl0.M(this.f11371s, false);
        xdl0.M(this.f11372t, true);
        xdl0.M(this.f11370r, true);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m14782N(View view) {
        xdl0.M(this.f11371s, true);
        xdl0.M(this.f11372t, false);
        xdl0.M(this.f11370r, false);
    }

    /* JADX INFO: renamed from: O */
    public final void m14783O() {
        this.f11354d.setClipToOutline(true);
        this.f11369q.setAdapter(new C0685b(upa.m25545z() ? vwb.f0(new Pair[]{Pair.create(Integer.valueOf(x2c0.f25822E4), "更多右滑"), Pair.create(Integer.valueOf(x2c0.f25886G4), "优先推荐"), Pair.create(Integer.valueOf(x2c0.f25948I4), "认证标识"), Pair.create(Integer.valueOf(x2c0.f26010K4), "高阶隐私设置"), Pair.create(Integer.valueOf(x2c0.f26072M4), "只看认证")}) : vwb.f0(new Pair[]{Pair.create(Integer.valueOf(x2c0.f25790D4), "更多右滑"), Pair.create(Integer.valueOf(x2c0.f25854F4), "优先推荐"), Pair.create(Integer.valueOf(x2c0.f25917H4), "认证标识"), Pair.create(Integer.valueOf(x2c0.f25979J4), "高阶隐私设置"), Pair.create(Integer.valueOf(x2c0.f26041L4), "只看认证")})));
        this.f11374v.setImageUrl(CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkRHUjRCT0UyT0NOTUVDV0lRS0xBTjRURVJYSlc1VDE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjE5NTM4MTc4NjM3NzE0NTE1fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkkzMlpRRFRUUklWSE5WMkhSSlZCS0FIR0FTVzQyWjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTAyMDQ4Nzk1MzA1ODIyNzM5fQ.webp");
        this.f11376x.setImageUrl(CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IllYNVBBM0pFVUtaSEZBUUVaRVdGV0FVUUtEUzJHUzE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MDA1MTY2NTUzNjYzOTQ5MzU4fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklUUEREUTJUUUhWWVVBT0JZUTY1M0pBNUFLWVRXUjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjYzMzcxNzc5ODA2NDg0MjAzOX0.webp");
        this.f11378z.setImageUrl(CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkJURlY0QTNJUFNPVVQ2TFZRWFE3V05ZRkhaWURINDE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjYxOTQyOTE1NjQ1NzcyMzAxfQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklNN1VLRlhMQTdLRlBWU0VJSjNBVks0NUVFSkFHVzE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MzY2MjQ4NDM4NTI0MTg3NDQ3fQ.webp");
        this.f11318B.setImageUrl(CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IldOTUVDMldXTExFWFBKS0FHTE5FTjVDNE81SU1DSTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjU1NzQ3MTA1ODE3OTMyNzM5OH0.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjZWSFpJQUIzV0dVUExBRExRRUE1RjJKQkFFRzdLVDE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjYwMTU4NDMzMTk4MzY4MTA4fQ.webp");
        int iY0 = (((xdl0.y0() - t100.d(64.0f)) * 96) / 78) / 4;
        xdl0.C0(this.f11374v, iY0);
        xdl0.C0(this.f11376x, iY0);
        xdl0.C0(this.f11378z, iY0);
        xdl0.C0(this.f11318B, iY0);
        if ("expand_privilege".equals(act().getIntent().getStringExtra("action"))) {
            xdl0.M(this.f11329I, false);
            xdl0.M(this.f11331J, true);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m14784P(StudentVerificationStatus studentVerificationStatus) {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        User userM21479ma = CoreModule.f1534c.f3628e0.m21479ma();
        if (userM21490p9 == null || userM21479ma == null) {
            return;
        }
        boolean zEquals = TEnum.equals(studentVerificationStatus, "verified");
        VText_NoTopPadding vText_NoTopPadding = this.f11356f;
        if (zEquals) {
            vText_NoTopPadding.setText("头像本人认证通过");
            this.f11357g.setText("认证通过，权益生效中");
            this.f11354d.setBackground(nu0.b(m14776C0(), x2c0.f26134O4));
            this.f11358h.setImageDrawable(nu0.b(m14776C0(), x2c0.f26289T4));
            this.f11360j.setText("头像本人");
            this.f11360j.setBackgroundDrawable(nu0.b(m14776C0(), x2c0.f25694A4));
            this.f11360j.setCompoundDrawablesWithIntrinsicBounds(upa.m25545z() ? x2c0.f25758C4 : x2c0.f25726B4, 0, 0, 0);
            xdl0.M(this.f11360j, true);
            xdl0.M(this.f11361k, false);
            xdl0.M(this.f11321E, true);
            this.f11359i.setImageURI(userM21490p9.fp().profile480().formatted());
            return;
        }
        vText_NoTopPadding.setText("头像本人认证");
        this.f11357g.setText("使用五官清晰正面照完成认证");
        this.f11354d.setBackground(nu0.b(m14776C0(), x2c0.f26730h5));
        this.f11358h.setImageDrawable(nu0.b(m14776C0(), x2c0.f26258S4));
        if (userM21490p9.isFakeUser() || userM21490p9.fp().isLabelJudge(MediaLabel.get("LOW_FACE_MARK"))) {
            this.f11360j.setText("认证成功率低");
            this.f11360j.setBackgroundDrawable(nu0.b(m14776C0(), x2c0.f27303z4));
            this.f11360j.setCompoundDrawablesWithIntrinsicBounds(upa.m25545z() ? x2c0.f25690A0 : x2c0.f27299z0, 0, 0, 0);
            xdl0.M(this.f11360j, true);
        } else {
            xdl0.M(this.f11360j, false);
        }
        xdl0.M(this.f11361k, true);
        xdl0.M(this.f11321E, false);
        this.f11359i.setImageURI(((Media) userM21479ma.fp()).url);
        m14785Q(studentVerificationStatus);
    }

    /* JADX INFO: renamed from: Q */
    public final void m14785Q(StudentVerificationStatus studentVerificationStatus) {
        User userM21479ma = CoreModule.f1534c.f3628e0.m21479ma();
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f11320D.setText("认证失败，重新尝试");
            this.f11320D.setTextColor(Color.parseColor("#FFFFFF"));
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f11320D.setText("审核中...");
            this.f11320D.setTextColor(Color.parseColor("#66FFFFFF"));
        } else if (userM21479ma.isFakeUser() || userM21479ma.fp().isLabelJudge(MediaLabel.get("LOW_FACE_MARK"))) {
            this.f11320D.setText("更换照片，完成认证");
            this.f11320D.setTextColor(Color.parseColor("#FFFFFFFF"));
        } else {
            this.f11320D.setText("立即认证，获得特权");
            this.f11320D.setTextColor(Color.parseColor("#FFFFFFFF"));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m14786R(int i, int i2, int i3) {
        this.f11323F.setText(m14795s(i, "次"));
        this.f11325G.setText(m14795s(i2, "人"));
        this.f11327H.setText(m14795s(i3, "人"));
    }

    /* JADX INFO: renamed from: S */
    public void m14787S(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f11322E0.setText("已认证");
                this.f11322E0.setTextColor(Color.parseColor("#66000000"));
                xdl0.M(this.f11368p0, false);
                xdl0.M(this.f11322E0, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText_NoTopPadding vText_NoTopPadding = this.f11322E0;
            if (zEquals) {
                vText_NoTopPadding.setText("审核中");
                this.f11322E0.setTextColor(Color.parseColor("#66000000"));
                xdl0.M(this.f11368p0, false);
                xdl0.M(this.f11322E0, true);
                return;
            }
            vText_NoTopPadding.setText("待激活");
            this.f11322E0.setTextColor(Color.parseColor("#FE7E1D"));
            xdl0.M(this.f11368p0, false);
            xdl0.M(this.f11322E0, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f11322E0.setText("审核中");
            this.f11322E0.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f11368p0, false);
            xdl0.M(this.f11322E0, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f11322E0.setText("认证失败");
            this.f11322E0.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f11368p0, false);
            xdl0.M(this.f11322E0, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.M(this.f11368p0, true);
            xdl0.M(this.f11322E0, false);
        } else {
            this.f11322E0.setText("已失效");
            this.f11322E0.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f11368p0, false);
            xdl0.M(this.f11322E0, true);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m14788T(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f11348X.setText("已认证");
                this.f11348X.setTextColor(Color.parseColor("#66000000"));
                xdl0.M(this.f11347W, false);
                xdl0.M(this.f11348X, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText_NoTopPadding vText_NoTopPadding = this.f11348X;
            if (zEquals) {
                vText_NoTopPadding.setText("审核中");
                this.f11348X.setTextColor(Color.parseColor("#66000000"));
                xdl0.M(this.f11347W, false);
                xdl0.M(this.f11348X, true);
                return;
            }
            vText_NoTopPadding.setText("待激活");
            this.f11348X.setTextColor(Color.parseColor("#FF700A"));
            xdl0.M(this.f11347W, false);
            xdl0.M(this.f11348X, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f11348X.setText("认证失败");
            this.f11348X.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f11347W, false);
            xdl0.M(this.f11348X, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f11348X.setText("审核中");
            this.f11348X.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f11347W, false);
            xdl0.M(this.f11348X, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.M(this.f11347W, true);
            xdl0.M(this.f11348X, false);
        } else {
            this.f11348X.setText("已失效");
            this.f11348X.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f11347W, false);
            xdl0.M(this.f11348X, true);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m14789U(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            this.f11332J0.setText("已认证");
            xdl0.M(this.f11330I0, false);
            xdl0.M(this.f11332J0, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f11332J0.setText("认证失败");
            xdl0.M(this.f11330I0, false);
            xdl0.M(this.f11332J0, true);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f11332J0.setText("审核中");
            xdl0.M(this.f11330I0, false);
            xdl0.M(this.f11332J0, true);
        } else if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.M(this.f11330I0, true);
            xdl0.M(this.f11332J0, false);
        } else {
            this.f11332J0.setText("已失效");
            xdl0.M(this.f11330I0, false);
            xdl0.M(this.f11332J0, true);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m14790V(boolean z) {
        xdl0.M(this.f11324F0, z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m14792p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public View m14792p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gp4.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m14791i1(so4 so4Var) {
        this.f11336L0 = so4Var;
    }

    /* JADX INFO: renamed from: r */
    public void m14794r() {
        m14773A();
        m14772y();
        m14783O();
        m14771w();
        m14798x();
        if (upa.m25545z()) {
            m14799z();
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m14795s(int i, String str) {
        return i >= 10000 ? String.format("%.1fw%s", Double.valueOf(Math.round(((double) i) / 1000.0d) / 10.0d), str) : String.format("%d%s", Integer.valueOf(i), str);
    }

    /* JADX INFO: renamed from: u */
    public final void m14796u(List<String> list, int i, int i2, int i3) {
        this.f11365n.removeAllViews();
        m14797v(list, this.f11365n, i, t100.j, i2, (list.size() == 1 && list.get(0).startsWith("res")) ? 0 : i3);
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
    public final void m14797v(List<String> list, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        for (String str : list) {
            View vDraweeView = new VDraweeView(act());
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.v(true);
            vDraweeView.getHierarchy().H(roundingParams);
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
            qib0.f19782G.m12738I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m14798x() {
        if (upa.m25498p2()) {
            this.f11370r.setAdapter(new C0685b(vwb.f0(new Pair[]{Pair.create(Integer.valueOf(x2c0.f25790D4), "更多右滑"), Pair.create(Integer.valueOf(x2c0.f25854F4), "优先推荐"), Pair.create(Integer.valueOf(x2c0.f25917H4), "认证标识"), Pair.create(Integer.valueOf(x2c0.f25979J4), "高阶隐私设置"), Pair.create(Integer.valueOf(x2c0.f26041L4), "只看认证")})));
            xdl0.E0(this.f11371s, new View.OnClickListener() { // from class: l.to4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22207a.m14781M(view);
                }
            });
            xdl0.E0(this.f11372t, new View.OnClickListener() { // from class: l.vo4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24398a.m14782N(view);
                }
            });
            String stringExtra = act().getIntent().getStringExtra("tip_type");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            xdl0.X(this.f11373u, t100.d(26.0f));
            xdl0.M(this.f11364m, true);
            xdl0.M(this.f11371s, true);
            xdl0.M(this.f11369q, false);
            this.f11363l.setText("完成认证后，解锁多项权益");
            int i = C0684a.f11379a[IdentifyView.TipType.valueOf(stringExtra).ordinal()];
            if (i == 1) {
                m14775C();
            } else if (i == 2) {
                m14777E();
            } else {
                if (i != 3) {
                    return;
                }
                m14774B();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m14799z() {
        this.f11351a.setLeftIconResource(x2c0.f26363Vg);
        this.f11353c.setTextColor(Color.parseColor("#66000000"));
        this.f11355e.setImageResource(x2c0.f27271y4);
        this.f11375w.setCompoundDrawablesWithIntrinsicBounds(x2c0.f27284yh, 0, 0, 0);
        this.f11377y.setCompoundDrawablesWithIntrinsicBounds(x2c0.f27284yh, 0, 0, 0);
        this.f11317A.setCompoundDrawablesWithIntrinsicBounds(x2c0.f25722B0, 0, 0, 0);
        this.f11319C.setCompoundDrawablesWithIntrinsicBounds(x2c0.f25722B0, 0, 0, 0);
        this.f11320D.setBackgroundResource(x2c0.f26394Wg);
        this.f11335L.setImageResource(x2c0.f26351V4);
        this.f11339O.setImageResource(x2c0.f26382W4);
        this.f11341Q.setImageResource(x2c0.f26413X4);
        this.f11338N.setImageResource(x2c0.f27239x4);
        this.f11343S.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f26320U4, 0);
        this.f11329I.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f26444Y4, 0);
        this.f11346V.setTextColor(Color.parseColor("#000000"));
        this.f11347W.setImageResource(x2c0.f27239x4);
        this.f11362k0.setTextColor(Color.parseColor("#000000"));
        this.f11368p0.setImageResource(x2c0.f27239x4);
        this.f11328H0.setTextColor(Color.parseColor("#000000"));
        this.f11330I0.setImageResource(x2c0.f27239x4);
        this.f11345U.setImageResource(x2c0.f26507a5);
        this.f11326G0.setImageResource(x2c0.f26634e5);
        this.f11350Z.setImageResource(x2c0.f26475Z4);
        this.f11352b.setImageResource(x2c0.f26666f5);
    }

    public void destroy() {
    }
}
