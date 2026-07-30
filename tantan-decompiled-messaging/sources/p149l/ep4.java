package p149l;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ExtraInfos;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p046p1.mobile.putong.core.p053ui.verification.CertCenterV2Frag;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.List;
import java.util.Locale;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class ep4 implements s7m<so4> {

    /* JADX INFO: renamed from: A */
    public VText_NoTopPadding f92537A;

    /* JADX INFO: renamed from: B */
    public AutoVDraweeView f92538B;

    /* JADX INFO: renamed from: C */
    public VText_NoTopPadding f92539C;

    /* JADX INFO: renamed from: D */
    public VText_NoTopPadding f92540D;

    /* JADX INFO: renamed from: E */
    public VLinear f92541E;

    /* JADX INFO: renamed from: E0 */
    public VText_NoTopPadding f92542E0;

    /* JADX INFO: renamed from: F */
    public VText_NoTopPadding f92543F;

    /* JADX INFO: renamed from: F0 */
    public VLinear f92544F0;

    /* JADX INFO: renamed from: G */
    public VText_NoTopPadding f92545G;

    /* JADX INFO: renamed from: G0 */
    public VImage f92546G0;

    /* JADX INFO: renamed from: H */
    public VText_NoTopPadding f92547H;

    /* JADX INFO: renamed from: H0 */
    public VText_NoTopPadding f92548H0;

    /* JADX INFO: renamed from: I */
    public VText_NoTopPadding f92549I;

    /* JADX INFO: renamed from: I0 */
    public VImage f92550I0;

    /* JADX INFO: renamed from: J */
    public VLinear f92551J;

    /* JADX INFO: renamed from: J0 */
    public VText_NoTopPadding f92552J0;

    /* JADX INFO: renamed from: K */
    public VRelative f92553K;

    /* JADX INFO: renamed from: K0 */
    public CertCenterV2Frag f92554K0;

    /* JADX INFO: renamed from: L */
    public ImageView f92555L;

    /* JADX INFO: renamed from: L0 */
    public so4 f92556L0;

    /* JADX INFO: renamed from: M */
    public VText_NoTopPadding f92557M;

    /* JADX INFO: renamed from: N */
    public ImageView f92558N;

    /* JADX INFO: renamed from: O */
    public ImageView f92559O;

    /* JADX INFO: renamed from: P */
    public VText_NoTopPadding f92560P;

    /* JADX INFO: renamed from: Q */
    public ImageView f92561Q;

    /* JADX INFO: renamed from: R */
    public VText_NoTopPadding f92562R;

    /* JADX INFO: renamed from: S */
    public VText_NoTopPadding f92563S;

    /* JADX INFO: renamed from: T */
    public VLinear f92564T;

    /* JADX INFO: renamed from: U */
    public VImage f92565U;

    /* JADX INFO: renamed from: V */
    public VText_NoTopPadding f92566V;

    /* JADX INFO: renamed from: W */
    public VImage f92567W;

    /* JADX INFO: renamed from: X */
    public VText_NoTopPadding f92568X;

    /* JADX INFO: renamed from: Y */
    public VLinear f92569Y;

    /* JADX INFO: renamed from: Z */
    public VImage f92570Z;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f92571a;

    /* JADX INFO: renamed from: b */
    public VImage f92572b;

    /* JADX INFO: renamed from: c */
    public VText f92573c;

    /* JADX INFO: renamed from: d */
    public VLinear f92574d;

    /* JADX INFO: renamed from: e */
    public VImage f92575e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f92576f;

    /* JADX INFO: renamed from: g */
    public VText_NoTopPadding f92577g;

    /* JADX INFO: renamed from: h */
    public VImage f92578h;

    /* JADX INFO: renamed from: i */
    public SimpleDraweeView f92579i;

    /* JADX INFO: renamed from: j */
    public VText_NoTopPadding f92580j;

    /* JADX INFO: renamed from: k */
    public VLinear f92581k;

    /* JADX INFO: renamed from: k0 */
    public VText_NoTopPadding f92582k0;

    /* JADX INFO: renamed from: l */
    public VText f92583l;

    /* JADX INFO: renamed from: m */
    public VLinear f92584m;

    /* JADX INFO: renamed from: n */
    public VLinear f92585n;

    /* JADX INFO: renamed from: o */
    public VText f92586o;

    /* JADX INFO: renamed from: p */
    public VText f92587p;

    /* JADX INFO: renamed from: p0 */
    public VImage f92588p0;

    /* JADX INFO: renamed from: q */
    public VRecyclerView f92589q;

    /* JADX INFO: renamed from: r */
    public VRecyclerView f92590r;

    /* JADX INFO: renamed from: s */
    public VText f92591s;

    /* JADX INFO: renamed from: t */
    public VText f92592t;

    /* JADX INFO: renamed from: u */
    public VLinear f92593u;

    /* JADX INFO: renamed from: v */
    public AutoVDraweeView f92594v;

    /* JADX INFO: renamed from: w */
    public VText_NoTopPadding f92595w;

    /* JADX INFO: renamed from: x */
    public AutoVDraweeView f92596x;

    /* JADX INFO: renamed from: y */
    public VText_NoTopPadding f92597y;

    /* JADX INFO: renamed from: z */
    public AutoVDraweeView f92598z;

    /* JADX INFO: renamed from: l.ep4$a */
    public static /* synthetic */ class C16655a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f92599a;

        static {
            int[] iArr = new int[IdentifyView.TipType.values().length];
            f92599a = iArr;
            try {
                iArr[IdentifyView.TipType.INVITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92599a[IdentifyView.TipType.ONLY_CERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92599a[IdentifyView.TipType.SWIPE_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: l.ep4$b */
    public class C16656b extends dac0<Pair<Integer, String>> {

        /* JADX INFO: renamed from: c */
        public final List<Pair<Integer, String>> f92600c;

        public C16656b(List<Pair<Integer, String>> list) {
            this.f92600c = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m117598H(int i, View view) {
            ep4.this.f92556L0.m185229r0(i);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f92600c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(ep4.this.getAct()).inflate(f6c0.f95667Z0, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, Pair<Integer, String> pair, int i, final int i2) {
            VImage vImage = (VImage) view.findViewById(u4c0.f174496u5);
            VText_NoTopPadding vText_NoTopPadding = (VText_NoTopPadding) view.findViewById(u4c0.f173973P1);
            vImage.setImageDrawable(App.f15369e.getDrawable(((Integer) pair.first).intValue()));
            vText_NoTopPadding.setText((CharSequence) pair.second);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.fp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f98662a.m117598H(i2, view2);
                }
            });
            if (upa.m194800p2()) {
                vText_NoTopPadding.setTextColor(Color.parseColor("#66000000"));
                ((VImage) view.findViewById(u4c0.f173903L)).setImageResource(x2c0.f189567N4);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> getItem(int i) {
            return this.f92600c.get(i);
        }
    }

    public ep4(CertCenterV2Frag certCenterV2Frag) {
        this.f92554K0 = certCenterV2Frag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m117554F(View view) {
        this.f92556L0.m185228q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m117555J(View view) {
        this.f92556L0.m185226o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m117556K(View view) {
        xdl0.m208344M(this.f92549I, false);
        xdl0.m208344M(this.f92551J, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m117557L(View view) {
        xdl0.m208344M(this.f92549I, true);
        xdl0.m208344M(this.f92551J, false);
    }

    /* JADX INFO: renamed from: w */
    private void m117570w() {
        xdl0.m208329E0(this.f92540D, new View.OnClickListener() { // from class: l.wo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187379a.m117576G(view);
            }
        });
        xdl0.m208329E0(this.f92564T, new View.OnClickListener() { // from class: l.xo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193778a.m117577H(view);
            }
        });
        xdl0.m208329E0(this.f92544F0, new View.OnClickListener() { // from class: l.yo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199259a.m117578I(view);
            }
        });
        xdl0.m208329E0(this.f92569Y, new View.OnClickListener() { // from class: l.zo4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204088a.m117555J(view);
            }
        });
        xdl0.m208329E0(this.f92549I, new View.OnClickListener() { // from class: l.ap4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70977a.m117556K(view);
            }
        });
        xdl0.m208329E0(this.f92563S, new View.OnClickListener() { // from class: l.bp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76602a.m117557L(view);
            }
        });
        xdl0.m208329E0(this.f92553K, new View.OnClickListener() { // from class: l.cp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81899a.m117554F(view);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    private void m117571y() {
        this.f92571a.setLeftIconAsBack(getAct());
        this.f92571a.setTitle(getAct().string(R$string.f18836pr));
        this.f92571a.setBackgroundColor(Color.parseColor("#F8F8F8"));
        xdl0.m208360X(this.f92571a, hmb.m131709n1(getAct()) + t100.m186890d(6.0f));
    }

    /* JADX INFO: renamed from: A */
    public final void m117572A() {
        ((PutongAct) getAct()).setTransparentStatusBar();
        PutongAct.setLightStatusBar(getAct().getWindow(), 1024);
        getAct().getWindow().addFlags(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: B */
    public final void m117573B() {
        m117593u(vwb.m200324f0("res://" + getContext().getPackageName() + "/" + x2c0.f190162g5), t100.m186890d(42.0f), 0, 0);
        this.f92586o.setText("完成认证，提升每日右滑上限");
        this.f92587p.setText("每天可额外发出10次喜欢");
    }

    /* JADX INFO: renamed from: C */
    public final void m117574C() {
        MyTabTask myTabTask = (MyTabTask) vwb.m200346r(CoreModule.f17545c.f19639e0.f149396i7.m221515e(), new w9j() { // from class: l.dp4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("verification".equals(((MyTabTask) obj).type));
            }
        });
        if (NullChecker.m81303a(myTabTask)) {
            List<String> listM200334k0 = vwb.m200334k0(myTabTask.avatarGroups.get(0).avatars, 2);
            if (!vwb.m200296J(listM200334k0)) {
                m117593u(listM200334k0, t100.m186890d(listM200334k0.size() > 1 ? 42.0f : 36.0f), t100.m186890d(2.0f), Color.parseColor("#F7F7F7"));
            }
        }
        VText vText = this.f92586o;
        Locale locale = Locale.CHINA;
        vText.setText(String.format(locale, "完成认证，立即收到%s的喜欢", (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169527p9().settings) && TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().settings.getLookingFor(), "female")) ? "她们" : "他们"));
        this.f92587p.setText(String.format(locale, "%d人邀请你认证，通过后自动喜欢你", CoreModule.f17545c.f19639e0.f149428m7.get()));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f92554K0.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m117575E() {
        MyTabTask myTabTask = (MyTabTask) vwb.m200346r(CoreModule.f17545c.f19639e0.f149396i7.m221515e(), new w9j() { // from class: l.uo4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("verification".equals(((MyTabTask) obj).type));
            }
        });
        if (NullChecker.m81303a(myTabTask)) {
            ExtraInfos extraInfos = myTabTask.extraInfos;
            if (extraInfos.trialLikedCount <= 0 || vwb.m200296J(extraInfos.trialLikedAvatars)) {
                return;
            }
            List<String> listM200334k0 = vwb.m200334k0(myTabTask.extraInfos.trialLikedAvatars, 2);
            m117593u(listM200334k0, t100.m186890d(listM200334k0.size() > 1 ? 42.0f : 36.0f), t100.m186890d(2.0f), Color.parseColor("#F7F7F7"));
            this.f92586o.setText("完成认证，解锁“只看认证”功能");
            this.f92587p.setText(String.format(Locale.CHINA, "试用时喜欢的%d人才能看到你", Integer.valueOf(myTabTask.extraInfos.trialLikedCount)));
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m117576G(View view) {
        this.f92556L0.m185225n0();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m117577H(View view) {
        this.f92556L0.m185227p0();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m117578I(View view) {
        this.f92556L0.m185230s0();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m117579M(View view) {
        xdl0.m208344M(this.f92591s, false);
        xdl0.m208344M(this.f92592t, true);
        xdl0.m208344M(this.f92590r, true);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m117580N(View view) {
        xdl0.m208344M(this.f92591s, true);
        xdl0.m208344M(this.f92592t, false);
        xdl0.m208344M(this.f92590r, false);
    }

    /* JADX INFO: renamed from: O */
    public final void m117581O() {
        this.f92574d.setClipToOutline(true);
        this.f92589q.setAdapter(new C16656b(upa.m194847z() ? vwb.m200324f0(Pair.create(Integer.valueOf(x2c0.f189286E4), "更多右滑"), Pair.create(Integer.valueOf(x2c0.f189350G4), "优先推荐"), Pair.create(Integer.valueOf(x2c0.f189412I4), "认证标识"), Pair.create(Integer.valueOf(x2c0.f189474K4), "高阶隐私设置"), Pair.create(Integer.valueOf(x2c0.f189536M4), "只看认证")) : vwb.m200324f0(Pair.create(Integer.valueOf(x2c0.f189254D4), "更多右滑"), Pair.create(Integer.valueOf(x2c0.f189318F4), "优先推荐"), Pair.create(Integer.valueOf(x2c0.f189381H4), "认证标识"), Pair.create(Integer.valueOf(x2c0.f189443J4), "高阶隐私设置"), Pair.create(Integer.valueOf(x2c0.f189505L4), "只看认证"))));
        this.f92594v.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkRHUjRCT0UyT0NOTUVDV0lRS0xBTjRURVJYSlc1VDE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjE5NTM4MTc4NjM3NzE0NTE1fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkkzMlpRRFRUUklWSE5WMkhSSlZCS0FIR0FTVzQyWjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTAyMDQ4Nzk1MzA1ODIyNzM5fQ.webp");
        this.f92596x.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IllYNVBBM0pFVUtaSEZBUUVaRVdGV0FVUUtEUzJHUzE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MDA1MTY2NTUzNjYzOTQ5MzU4fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklUUEREUTJUUUhWWVVBT0JZUTY1M0pBNUFLWVRXUjE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjYzMzcxNzc5ODA2NDg0MjAzOX0.webp");
        this.f92598z.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkJURlY0QTNJUFNPVVQ2TFZRWFE3V05ZRkhaWURINDE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NjYxOTQyOTE1NjQ1NzcyMzAxfQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklNN1VLRlhMQTdLRlBWU0VJSjNBVks0NUVFSkFHVzE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MzY2MjQ4NDM4NTI0MTg3NDQ3fQ.webp");
        this.f92538B.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IldOTUVDMldXTExFWFBKS0FHTE5FTjVDNE81SU1DSTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMjU1NzQ3MTA1ODE3OTMyNzM5OH0.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjZWSFpJQUIzV0dVUExBRExRRUE1RjJKQkFFRzdLVDE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMjYwMTU4NDMzMTk4MzY4MTA4fQ.webp");
        int iM208412y0 = (((xdl0.m208412y0() - t100.m186890d(64.0f)) * 96) / 78) / 4;
        xdl0.m208325C0(this.f92594v, iM208412y0);
        xdl0.m208325C0(this.f92596x, iM208412y0);
        xdl0.m208325C0(this.f92598z, iM208412y0);
        xdl0.m208325C0(this.f92538B, iM208412y0);
        if ("expand_privilege".equals(getAct().getIntent().getStringExtra("action"))) {
            xdl0.m208344M(this.f92549I, false);
            xdl0.m208344M(this.f92551J, true);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m117582P(StudentVerificationStatus studentVerificationStatus) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        User userM169516ma = CoreModule.f17545c.f19639e0.m169516ma();
        if (userM169527p9 == null || userM169516ma == null) {
            return;
        }
        boolean zEquals = TEnum.equals(studentVerificationStatus, "verified");
        VText_NoTopPadding vText_NoTopPadding = this.f92576f;
        if (zEquals) {
            vText_NoTopPadding.setText("头像本人认证通过");
            this.f92577g.setText("认证通过，权益生效中");
            this.f92574d.setBackground(nu0.m161424b(getContext(), x2c0.f189598O4));
            this.f92578h.setImageDrawable(nu0.m161424b(getContext(), x2c0.f189753T4));
            this.f92580j.setText("头像本人");
            this.f92580j.setBackgroundDrawable(nu0.m161424b(getContext(), x2c0.f189158A4));
            this.f92580j.setCompoundDrawablesWithIntrinsicBounds(upa.m194847z() ? x2c0.f189222C4 : x2c0.f189190B4, 0, 0, 0);
            xdl0.m208344M(this.f92580j, true);
            xdl0.m208344M(this.f92581k, false);
            xdl0.m208344M(this.f92541E, true);
            this.f92579i.setImageURI(userM169527p9.m60124fp().profile480().formatted());
            return;
        }
        vText_NoTopPadding.setText("头像本人认证");
        this.f92577g.setText("使用五官清晰正面照完成认证");
        this.f92574d.setBackground(nu0.m161424b(getContext(), x2c0.f190194h5));
        this.f92578h.setImageDrawable(nu0.m161424b(getContext(), x2c0.f189722S4));
        if (userM169527p9.isFakeUser() || userM169527p9.m60124fp().isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK))) {
            this.f92580j.setText("认证成功率低");
            this.f92580j.setBackgroundDrawable(nu0.m161424b(getContext(), x2c0.f190767z4));
            this.f92580j.setCompoundDrawablesWithIntrinsicBounds(upa.m194847z() ? x2c0.f189154A0 : x2c0.f190763z0, 0, 0, 0);
            xdl0.m208344M(this.f92580j, true);
        } else {
            xdl0.m208344M(this.f92580j, false);
        }
        xdl0.m208344M(this.f92581k, true);
        xdl0.m208344M(this.f92541E, false);
        this.f92579i.setImageURI(userM169516ma.m60124fp().url);
        m117583Q(studentVerificationStatus);
    }

    /* JADX INFO: renamed from: Q */
    public final void m117583Q(StudentVerificationStatus studentVerificationStatus) {
        User userM169516ma = CoreModule.f17545c.f19639e0.m169516ma();
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f92540D.setText("认证失败，重新尝试");
            this.f92540D.setTextColor(Color.parseColor("#FFFFFF"));
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f92540D.setText("审核中...");
            this.f92540D.setTextColor(Color.parseColor("#66FFFFFF"));
        } else if (userM169516ma.isFakeUser() || userM169516ma.m60124fp().isLabelJudge(MediaLabel.get(MediaLabel.LOW_FACE_MARK))) {
            this.f92540D.setText("更换照片，完成认证");
            this.f92540D.setTextColor(Color.parseColor("#FFFFFFFF"));
        } else {
            this.f92540D.setText("立即认证，获得特权");
            this.f92540D.setTextColor(Color.parseColor("#FFFFFFFF"));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m117584R(int i, int i2, int i3) {
        this.f92543F.setText(m117592s(i, "次"));
        this.f92545G.setText(m117592s(i2, "人"));
        this.f92547H.setText(m117592s(i3, "人"));
    }

    /* JADX INFO: renamed from: S */
    public void m117585S(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f92542E0.setText("已认证");
                this.f92542E0.setTextColor(Color.parseColor("#66000000"));
                xdl0.m208344M(this.f92588p0, false);
                xdl0.m208344M(this.f92542E0, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText_NoTopPadding vText_NoTopPadding = this.f92542E0;
            if (zEquals) {
                vText_NoTopPadding.setText("审核中");
                this.f92542E0.setTextColor(Color.parseColor("#66000000"));
                xdl0.m208344M(this.f92588p0, false);
                xdl0.m208344M(this.f92542E0, true);
                return;
            }
            vText_NoTopPadding.setText("待激活");
            this.f92542E0.setTextColor(Color.parseColor("#FE7E1D"));
            xdl0.m208344M(this.f92588p0, false);
            xdl0.m208344M(this.f92542E0, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f92542E0.setText("审核中");
            this.f92542E0.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f92588p0, false);
            xdl0.m208344M(this.f92542E0, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f92542E0.setText("认证失败");
            this.f92542E0.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f92588p0, false);
            xdl0.m208344M(this.f92542E0, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.m208344M(this.f92588p0, true);
            xdl0.m208344M(this.f92542E0, false);
        } else {
            this.f92542E0.setText("已失效");
            this.f92542E0.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f92588p0, false);
            xdl0.m208344M(this.f92542E0, true);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m117586T(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f92568X.setText("已认证");
                this.f92568X.setTextColor(Color.parseColor("#66000000"));
                xdl0.m208344M(this.f92567W, false);
                xdl0.m208344M(this.f92568X, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText_NoTopPadding vText_NoTopPadding = this.f92568X;
            if (zEquals) {
                vText_NoTopPadding.setText("审核中");
                this.f92568X.setTextColor(Color.parseColor("#66000000"));
                xdl0.m208344M(this.f92567W, false);
                xdl0.m208344M(this.f92568X, true);
                return;
            }
            vText_NoTopPadding.setText("待激活");
            this.f92568X.setTextColor(Color.parseColor("#FF700A"));
            xdl0.m208344M(this.f92567W, false);
            xdl0.m208344M(this.f92568X, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f92568X.setText("认证失败");
            this.f92568X.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f92567W, false);
            xdl0.m208344M(this.f92568X, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f92568X.setText("审核中");
            this.f92568X.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f92567W, false);
            xdl0.m208344M(this.f92568X, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.m208344M(this.f92567W, true);
            xdl0.m208344M(this.f92568X, false);
        } else {
            this.f92568X.setText("已失效");
            this.f92568X.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f92567W, false);
            xdl0.m208344M(this.f92568X, true);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m117587U(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            this.f92552J0.setText("已认证");
            xdl0.m208344M(this.f92550I0, false);
            xdl0.m208344M(this.f92552J0, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f92552J0.setText("认证失败");
            xdl0.m208344M(this.f92550I0, false);
            xdl0.m208344M(this.f92552J0, true);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f92552J0.setText("审核中");
            xdl0.m208344M(this.f92550I0, false);
            xdl0.m208344M(this.f92552J0, true);
        } else if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.m208344M(this.f92550I0, true);
            xdl0.m208344M(this.f92552J0, false);
        } else {
            this.f92552J0.setText("已失效");
            xdl0.m208344M(this.f92550I0, false);
            xdl0.m208344M(this.f92552J0, true);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m117588V(boolean z) {
        xdl0.m208344M(this.f92544F0, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m117589p(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public View m117589p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gp4.m127328b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(so4 so4Var) {
        this.f92556L0 = so4Var;
    }

    /* JADX INFO: renamed from: r */
    public void m117591r() {
        m117572A();
        m117571y();
        m117581O();
        m117570w();
        m117595x();
        if (upa.m194847z()) {
            m117596z();
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m117592s(int i, String str) {
        return i >= 10000 ? String.format("%.1fw%s", Double.valueOf(Math.round(((double) i) / 1000.0d) / 10.0d), str) : String.format("%d%s", Integer.valueOf(i), str);
    }

    /* JADX INFO: renamed from: u */
    public final void m117593u(List<String> list, int i, int i2, int i3) {
        this.f92585n.removeAllViews();
        m117594v(list, this.f92585n, i, t100.f167261j, i2, (list.size() == 1 && list.get(0).startsWith(ShareConstants.RES_PATH)) ? 0 : i3);
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
    public final void m117594v(List<String> list, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        for (String str : list) {
            VDraweeView vDraweeView = new VDraweeView(getAct());
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8268v(true);
            ((djj) vDraweeView.getHierarchy()).m112053H(roundingParams);
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
            qib0.f154691G.m102325I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m117595x() {
        if (upa.m194800p2()) {
            this.f92590r.setAdapter(new C16656b(vwb.m200324f0(Pair.create(Integer.valueOf(x2c0.f189254D4), "更多右滑"), Pair.create(Integer.valueOf(x2c0.f189318F4), "优先推荐"), Pair.create(Integer.valueOf(x2c0.f189381H4), "认证标识"), Pair.create(Integer.valueOf(x2c0.f189443J4), "高阶隐私设置"), Pair.create(Integer.valueOf(x2c0.f189505L4), "只看认证"))));
            xdl0.m208329E0(this.f92591s, new View.OnClickListener() { // from class: l.to4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171317a.m117579M(view);
                }
            });
            xdl0.m208329E0(this.f92592t, new View.OnClickListener() { // from class: l.vo4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182334a.m117580N(view);
                }
            });
            String stringExtra = getAct().getIntent().getStringExtra("tip_type");
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            xdl0.m208360X(this.f92593u, t100.m186890d(26.0f));
            xdl0.m208344M(this.f92584m, true);
            xdl0.m208344M(this.f92591s, true);
            xdl0.m208344M(this.f92589q, false);
            this.f92583l.setText("完成认证后，解锁多项权益");
            int i = C16655a.f92599a[IdentifyView.TipType.valueOf(stringExtra).ordinal()];
            if (i == 1) {
                m117574C();
            } else if (i == 2) {
                m117575E();
            } else {
                if (i != 3) {
                    return;
                }
                m117573B();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m117596z() {
        this.f92571a.setLeftIconResource(x2c0.f189827Vg);
        this.f92573c.setTextColor(Color.parseColor("#66000000"));
        this.f92575e.setImageResource(x2c0.f190735y4);
        this.f92595w.setCompoundDrawablesWithIntrinsicBounds(x2c0.f190748yh, 0, 0, 0);
        this.f92597y.setCompoundDrawablesWithIntrinsicBounds(x2c0.f190748yh, 0, 0, 0);
        this.f92537A.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189186B0, 0, 0, 0);
        this.f92539C.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189186B0, 0, 0, 0);
        this.f92540D.setBackgroundResource(x2c0.f189858Wg);
        this.f92555L.setImageResource(x2c0.f189815V4);
        this.f92559O.setImageResource(x2c0.f189846W4);
        this.f92561Q.setImageResource(x2c0.f189877X4);
        this.f92558N.setImageResource(x2c0.f190703x4);
        this.f92563S.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189784U4, 0);
        this.f92549I.setCompoundDrawablesWithIntrinsicBounds(0, 0, x2c0.f189908Y4, 0);
        this.f92566V.setTextColor(Color.parseColor(Constants.BLACK));
        this.f92567W.setImageResource(x2c0.f190703x4);
        this.f92582k0.setTextColor(Color.parseColor(Constants.BLACK));
        this.f92588p0.setImageResource(x2c0.f190703x4);
        this.f92548H0.setTextColor(Color.parseColor(Constants.BLACK));
        this.f92550I0.setImageResource(x2c0.f190703x4);
        this.f92565U.setImageResource(x2c0.f189971a5);
        this.f92546G0.setImageResource(x2c0.f190098e5);
        this.f92570Z.setImageResource(x2c0.f189939Z4);
        this.f92572b.setImageResource(x2c0.f190130f5);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
