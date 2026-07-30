package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.NewTags;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.TagCategories;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.p051p1.mobile.putong.data.OmsTagCard;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class y0i0 implements sxl0 {

    /* JADX INFO: renamed from: A */
    public VText f196978A;

    /* JADX INFO: renamed from: B */
    public TextView f196979B;

    /* JADX INFO: renamed from: C */
    public x0m f196980C;

    /* JADX INFO: renamed from: F */
    public int f196983F;

    /* JADX INFO: renamed from: a */
    public FrameLayout f196988a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f196989b;

    /* JADX INFO: renamed from: c */
    public ImageView f196990c;

    /* JADX INFO: renamed from: d */
    public TextView f196991d;

    /* JADX INFO: renamed from: e */
    public TextView f196992e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f196993f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f196994g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f196995h;

    /* JADX INFO: renamed from: i */
    public VText f196996i;

    /* JADX INFO: renamed from: j */
    public VText f196997j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f196998k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f196999l;

    /* JADX INFO: renamed from: m */
    public VText f197000m;

    /* JADX INFO: renamed from: n */
    public VText f197001n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f197002o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f197003p;

    /* JADX INFO: renamed from: q */
    public VText f197004q;

    /* JADX INFO: renamed from: r */
    public VText f197005r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f197006s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f197007t;

    /* JADX INFO: renamed from: u */
    public VText f197008u;

    /* JADX INFO: renamed from: v */
    public VText f197009v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f197010w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f197011x;

    /* JADX INFO: renamed from: y */
    public VText f197012y;

    /* JADX INFO: renamed from: z */
    public VText f197013z;

    /* JADX INFO: renamed from: D */
    public boolean f196981D = false;

    /* JADX INFO: renamed from: E */
    public int f196982E = 0;

    /* JADX INFO: renamed from: G */
    public List<String> f196984G = new ArrayList();

    /* JADX INFO: renamed from: H */
    public y20<SwipeDirection> f196985H = new y20() { // from class: l.r0i0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f160637a.m213856y((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: I */
    public long f196986I = 0;

    /* JADX INFO: renamed from: J */
    public boolean f196987J = false;

    public y0i0(x0m x0mVar) {
        this.f196980C = x0mVar;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m213850i(Throwable th) {
        if (bsj0.m106250H(th)) {
            return;
        }
        r1j0.m179420g("保存失败");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Tag m213853l(String str) {
        return new Tag("personality", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m213856y(SwipeDirection swipeDirection) {
        this.f196980C.mo37749V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    /* JADX INFO: renamed from: A */
    public void m213857A(NewTags newTags) {
        uqb0.f180374G.m127115L0(this.f196995h, newTags.icon);
        this.f196996i.setText(newTags.name);
        this.f196997j.setText(m213869q(newTags.localTagUserCounts));
        m213873u(this.f196994g, newTags.f21199id);
        m213872t(this.f196994g, newTags.f21199id);
    }

    /* JADX INFO: renamed from: B */
    public void m213858B(NewTags newTags) {
        uqb0.f180374G.m127115L0(this.f196999l, newTags.icon);
        this.f197000m.setText(newTags.name);
        this.f197001n.setText(m213869q(newTags.localTagUserCounts));
        m213873u(this.f196998k, newTags.f21199id);
        m213872t(this.f196998k, newTags.f21199id);
    }

    /* JADX INFO: renamed from: C */
    public void m213859C(NewTags newTags) {
        uqb0.f180374G.m127115L0(this.f197003p, newTags.icon);
        this.f197004q.setText(newTags.name);
        this.f197005r.setText(m213869q(newTags.localTagUserCounts));
        m213873u(this.f197002o, newTags.f21199id);
        m213872t(this.f197002o, newTags.f21199id);
    }

    /* JADX INFO: renamed from: D */
    public void m213860D(NewTags newTags) {
        uqb0.f180374G.m127115L0(this.f197007t, newTags.icon);
        this.f197008u.setText(newTags.name);
        this.f197009v.setText(m213869q(newTags.localTagUserCounts));
        m213873u(this.f197006s, newTags.f21199id);
        m213872t(this.f197006s, newTags.f21199id);
    }

    /* JADX INFO: renamed from: E */
    public void m213861E(NewTags newTags) {
        uqb0.f180374G.m127115L0(this.f197011x, newTags.icon);
        this.f197012y.setText(newTags.name);
        this.f197013z.setText(m213869q(newTags.localTagUserCounts));
        m213873u(this.f197010w, newTags.f21199id);
        m213872t(this.f197010w, newTags.f21199id);
    }

    /* JADX INFO: renamed from: F */
    public void m213862F(List<NewTags> list) {
        if (list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            m213865I(4, 4, 4, 4, 4);
            bnl0.m105564k0(this.f196988a);
            return;
        }
        if (size == 1) {
            m213865I(0, 4, 4, 4, 4);
            m213857A(list.get(0));
            bnl0.m105564k0(this.f196988a);
            return;
        }
        if (size == 2) {
            m213865I(0, 0, 4, 4, 4);
            m213857A(list.get(0));
            m213858B(list.get(1));
            bnl0.m105564k0(this.f196988a);
            return;
        }
        if (size == 3) {
            m213865I(0, 0, 0, 4, 4);
            m213857A(list.get(0));
            m213858B(list.get(1));
            m213859C(list.get(2));
            bnl0.m105564k0(this.f196988a);
            return;
        }
        if (size == 4) {
            m213865I(0, 0, 0, 0, 4);
            m213857A(list.get(0));
            m213858B(list.get(1));
            m213859C(list.get(2));
            m213860D(list.get(3));
            bnl0.m105564k0(this.f196988a);
            return;
        }
        if (size != 5) {
            return;
        }
        m213865I(0, 0, 0, 0, 0);
        m213857A(list.get(0));
        m213858B(list.get(1));
        m213859C(list.get(2));
        m213860D(list.get(3));
        m213861E(list.get(4));
        bnl0.m105564k0(this.f196988a);
    }

    /* JADX INFO: renamed from: G */
    public void m213863G(List<String> list, List<String> list2) {
        if (list == null || list.size() == 0) {
            return;
        }
        User userMo225055clone = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        userMo225055clone.profile.extensions.interest.tags = list;
        List<String> listMo34427Ts = CoreModule.m30933P().m143405a().mo34427Ts(list.subList(0, Math.min(list.size(), 10)));
        userMo225055clone.profile.tags = jyb.m147486Q(listMo34427Ts, new qcj() { // from class: l.v0i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return y0i0.m213853l((String) obj);
            }
        });
        User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116593na());
        if (NullChecker.m82486a(userSubtract)) {
            this.f196980C.mo37767z1(CoreModule.f18264c.f20381e0.m116620u9(userSubtract)).subscribe(psd0.m173597H(new y20() { // from class: l.w0i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f186599a.m213877z((uxj0) obj);
                }
            }, new y20() { // from class: l.x0i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    y0i0.m213850i((Throwable) obj);
                }
            }));
        } else {
            this.f196987J = true;
            this.f196985H.call(SwipeDirection.RIGHT);
            r1j0.m179420g("已添加");
            CoreModule.f18264c.f20405m0.f20144c2.add("e_card_add_operation_tag_button");
        }
        m213868p(list2);
    }

    /* JADX INFO: renamed from: H */
    public void m213864H(List<NewTags> list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i3 = size / i2;
        if (size % i2 == 0) {
            i3--;
        }
        if (i > i3) {
            this.f196982E = 0;
        } else {
            this.f196982E = i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = this.f196982E * i2; i4 < list.size() && i4 >= 0 && i4 < (this.f196982E + 1) * i2; i4++) {
            arrayList.add(list.get(i4));
        }
        if (i != 0 && arrayList.size() < i2) {
            int size2 = i2 - arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList.add(list.get(i5));
            }
        }
        m213862F(arrayList);
    }

    /* JADX INFO: renamed from: I */
    public void m213865I(int i, int i2, int i3, int i4, int i5) {
        this.f196994g.setVisibility(i);
        this.f196998k.setVisibility(i2);
        this.f197002o.setVisibility(i3);
        this.f197006s.setVisibility(i4);
        boolean z = this.f196981D;
        ConstraintLayout constraintLayout = this.f197010w;
        if (z) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(i5);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m213866J() {
        boolean zIsEmpty = this.f196984G.isEmpty();
        VText vText = this.f196978A;
        if (zIsEmpty) {
            vText.setBackground(CoreModule.f18263b.getResources().getDrawable(fbc0.f98068g));
            this.f196978A.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92616d));
        } else {
            vText.setBackground(CoreModule.f18263b.getResources().getDrawable(fbc0.f98068g));
            this.f196978A.setTextColor(CoreModule.f18263b.getResources().getColor(e9c0.f92618f));
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewM213867o = m213867o(layoutInflater, viewGroup);
        m213865I(4, 4, 4, 4, 4);
        int iMo37758l1 = (this.f196980C.mo37758l1() / 2) - rsf0.m182959c(114.0f);
        this.f197000m.setMaxWidth(iMo37758l1);
        this.f197001n.setMaxWidth(iMo37758l1);
        this.f197004q.setMaxWidth(iMo37758l1);
        this.f197005r.setMaxWidth(iMo37758l1);
        int iMo37758l2 = this.f196980C.mo37758l1() - rsf0.m182959c(142.0f);
        this.f196996i.setMaxWidth(iMo37758l2);
        this.f197009v.setMaxWidth(iMo37758l2);
        this.f197012y.setMaxWidth(iMo37758l2);
        return viewM213867o;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e == null) {
            return;
        }
        m213870r();
        CoreSuggested.UserInfo userInfo = partialListOptM222761e.loaded.get(i);
        if (NullChecker.m82486a(userInfo)) {
            Object obj = userInfo.extensionObject;
            if (obj instanceof OMSAdCardInfo) {
                OmsTagCard omsTagCard = ((OMSAdCardInfo) obj).content.tagCard;
                List<Media> list = omsTagCard.pictures;
                if (!list.isEmpty()) {
                    uqb0.f180374G.m127115L0(this.f196989b, CoreModule.m30933P().m143405a().mo34430Ub(list.get(0)));
                }
                this.f196991d.setText(omsTagCard.title);
                this.f196992e.setText(omsTagCard.subTitle);
                this.f196978A.setTypeface(Typeface.DEFAULT_BOLD);
                final boolean zMo34288Ak = CoreModule.m30933P().m143405a().mo34288Ak(omsTagCard.tagUserCounts);
                final List<NewTags> listMo34466ai = CoreModule.m30933P().m143405a().mo34466ai(omsTagCard.tagUserCounts);
                this.f196983F = this.f196981D ? 4 : 5;
                if (zMo34288Ak) {
                    int size = listMo34466ai.size();
                    int i2 = this.f196983F;
                    TextView textView = this.f196979B;
                    if (size <= i2) {
                        textView.setVisibility(8);
                        m213862F(listMo34466ai);
                    } else {
                        textView.setVisibility(0);
                        m213864H(listMo34466ai, 0, this.f196983F);
                    }
                }
                this.f196979B.setOnClickListener(new View.OnClickListener() { // from class: l.s0i0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.f165703a.m213874v(zMo34288Ak, listMo34466ai, view3);
                    }
                });
            }
        }
        if (i == 0) {
            this.f196980C.mo37745O3();
            if (NullChecker.m82486a(userInfo)) {
                Object obj2 = userInfo.extensionObject;
                if (obj2 instanceof OMSAdCardInfo) {
                    OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj2;
                    pk50.m172568j().m172574f().m181662Z(oMSAdCardInfo.identifier, 0, false);
                    fb0.m124812k(oMSAdCardInfo);
                    if (System.currentTimeMillis() - this.f196986I > 500 && !this.f196987J) {
                        this.f196986I = System.currentTimeMillis();
                        i4g0.m138526x("e_card_add_operation_tag_button", "p_suggest_users_home_view");
                    }
                }
            }
            bnl0.m105509E0(this.f196978A, new View.OnClickListener() { // from class: l.t0i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f171529a.m213875w(view3);
                }
            });
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: o */
    public View m213867o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z0i0.m218133b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public void m213868p(List<String> list) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean zMo34321F9 = CoreModule.m30933P().m143405a().mo34321F9(list);
        List<NewTags> listMo34362La = CoreModule.m30933P().m143405a().mo34362La(list);
        if (zMo34321F9 && !listMo34362La.isEmpty()) {
            for (NewTags newTags : listMo34362La) {
                if (!TextUtils.isEmpty(newTags.name)) {
                    sb2.append(newTags.name);
                    sb2.append(Constants.SEPARATOR_COMMA);
                }
                if (!newTags.localTagCategories.isEmpty()) {
                    for (TagCategories tagCategories : newTags.localTagCategories) {
                        if (!TextUtils.isEmpty(tagCategories.name)) {
                            sb.append(tagCategories.name);
                            sb.append(Constants.SEPARATOR_COMMA);
                        }
                    }
                }
            }
        }
        i4g0.m138523u("e_card_add_operation_tag_button", "p_suggest_users_home_view", jyb.m147494Y("personal_tag_category", sb.toString()), jyb.m147494Y("personal_tag_name", sb2.toString()));
    }

    /* JADX INFO: renamed from: q */
    public String m213869q(long j) {
        if (j < 0) {
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        double d = j;
        if (d < 1000.0d) {
            return j + "人已添加";
        }
        if (d < 10000.0d) {
            return decimalFormat.format(d / 1000.0d) + "k人已添加";
        }
        if (d < 1.0E8d) {
            return decimalFormat.format(d / 10000.0d) + "w人已添加";
        }
        return decimalFormat.format(d / 1.0E8d) + "亿人已添加";
    }

    /* JADX INFO: renamed from: r */
    public void m213870r() {
        if (rsf0.m182965i(this.f196980C.mo37760p0()) < 600.0f) {
            this.f196981D = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m213871s() {
        List<String> list = CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.interest.tags;
        return CoreModule.m30933P().m143405a().mo34321F9(list) && CoreModule.m30933P().m143405a().mo34362La(list).size() + this.f196984G.size() >= 200;
    }

    /* JADX INFO: renamed from: t */
    public void m213872t(final ConstraintLayout constraintLayout, final String str) {
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: l.u0i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176890a.m213876x(str, constraintLayout, view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m213873u(ConstraintLayout constraintLayout, String str) {
        if (this.f196984G.contains(str)) {
            constraintLayout.setBackground(CoreModule.f18263b.getResources().getDrawable(fbc0.f98069h));
        } else {
            constraintLayout.setBackground(CoreModule.f18263b.getResources().getDrawable(fbc0.f98070i));
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m213874v(boolean z, List list, View view) {
        if (z) {
            m213864H(list, this.f196982E + 1, this.f196983F);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m213875w(View view) {
        if (!Network.isConnected(this.f196980C.mo37761q1())) {
            r1j0.m179420g("网络无法连接");
            return;
        }
        if (this.f196984G.size() >= 1) {
            List<String> arrayList = new ArrayList<>(CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.interest.tags);
            boolean zIsEmpty = arrayList.isEmpty();
            List<String> list = this.f196984G;
            if (zIsEmpty) {
                arrayList = list;
            } else {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.remove(it.next());
                }
                arrayList.addAll(0, this.f196984G);
            }
            if (arrayList.size() < 5) {
                r1j0.m179420g("请至少选择5个标签");
            } else {
                m213863G(arrayList, this.f196984G);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m213876x(String str, ConstraintLayout constraintLayout, View view) {
        if (this.f196984G.contains(str)) {
            this.f196984G.remove(str);
        } else if (m213871s()) {
            r1j0.m179420g("选择的数量达到标签上限");
        } else {
            this.f196984G.add(str);
        }
        m213873u(constraintLayout, str);
        m213866J();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m213877z(uxj0 uxj0Var) {
        this.f196987J = true;
        this.f196985H.call(SwipeDirection.RIGHT);
        r1j0.m179420g("已添加");
        CoreModule.f18264c.f20405m0.f20144c2.add("e_card_add_operation_tag_button");
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
