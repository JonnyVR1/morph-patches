package p149l;

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
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.TagCategories;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.p046p1.mobile.putong.data.OmsTagCard;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class qsh0 implements ool0 {

    /* JADX INFO: renamed from: A */
    public VText f156195A;

    /* JADX INFO: renamed from: B */
    public TextView f156196B;

    /* JADX INFO: renamed from: C */
    public eyl f156197C;

    /* JADX INFO: renamed from: F */
    public int f156200F;

    /* JADX INFO: renamed from: a */
    public FrameLayout f156205a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f156206b;

    /* JADX INFO: renamed from: c */
    public ImageView f156207c;

    /* JADX INFO: renamed from: d */
    public TextView f156208d;

    /* JADX INFO: renamed from: e */
    public TextView f156209e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f156210f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f156211g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f156212h;

    /* JADX INFO: renamed from: i */
    public VText f156213i;

    /* JADX INFO: renamed from: j */
    public VText f156214j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f156215k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f156216l;

    /* JADX INFO: renamed from: m */
    public VText f156217m;

    /* JADX INFO: renamed from: n */
    public VText f156218n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f156219o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f156220p;

    /* JADX INFO: renamed from: q */
    public VText f156221q;

    /* JADX INFO: renamed from: r */
    public VText f156222r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f156223s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f156224t;

    /* JADX INFO: renamed from: u */
    public VText f156225u;

    /* JADX INFO: renamed from: v */
    public VText f156226v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f156227w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f156228x;

    /* JADX INFO: renamed from: y */
    public VText f156229y;

    /* JADX INFO: renamed from: z */
    public VText f156230z;

    /* JADX INFO: renamed from: D */
    public boolean f156198D = false;

    /* JADX INFO: renamed from: E */
    public int f156199E = 0;

    /* JADX INFO: renamed from: G */
    public List<String> f156201G = new ArrayList();

    /* JADX INFO: renamed from: H */
    public e30<SwipeDirection> f156202H = new e30() { // from class: l.jsh0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f119510a.m176265y((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: I */
    public long f156203I = 0;

    /* JADX INFO: renamed from: J */
    public boolean f156204J = false;

    public qsh0(eyl eylVar) {
        this.f156197C = eylVar;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m176259i(Throwable th) {
        if (yij0.m214930H(th)) {
            return;
        }
        osi0.m165783g("保存失败");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Tag m176262l(String str) {
        return new Tag("personality", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m176265y(SwipeDirection swipeDirection) {
        this.f156197C.mo36746V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    /* JADX INFO: renamed from: A */
    public void m176266A(NewTags newTags) {
        qib0.f154691G.m102331L0(this.f156212h, newTags.icon);
        this.f156213i.setText(newTags.name);
        this.f156214j.setText(m176278q(newTags.localTagUserCounts));
        m176282u(this.f156211g, newTags.f20457id);
        m176281t(this.f156211g, newTags.f20457id);
    }

    /* JADX INFO: renamed from: B */
    public void m176267B(NewTags newTags) {
        qib0.f154691G.m102331L0(this.f156216l, newTags.icon);
        this.f156217m.setText(newTags.name);
        this.f156218n.setText(m176278q(newTags.localTagUserCounts));
        m176282u(this.f156215k, newTags.f20457id);
        m176281t(this.f156215k, newTags.f20457id);
    }

    /* JADX INFO: renamed from: C */
    public void m176268C(NewTags newTags) {
        qib0.f154691G.m102331L0(this.f156220p, newTags.icon);
        this.f156221q.setText(newTags.name);
        this.f156222r.setText(m176278q(newTags.localTagUserCounts));
        m176282u(this.f156219o, newTags.f20457id);
        m176281t(this.f156219o, newTags.f20457id);
    }

    /* JADX INFO: renamed from: D */
    public void m176269D(NewTags newTags) {
        qib0.f154691G.m102331L0(this.f156224t, newTags.icon);
        this.f156225u.setText(newTags.name);
        this.f156226v.setText(m176278q(newTags.localTagUserCounts));
        m176282u(this.f156223s, newTags.f20457id);
        m176281t(this.f156223s, newTags.f20457id);
    }

    /* JADX INFO: renamed from: E */
    public void m176270E(NewTags newTags) {
        qib0.f154691G.m102331L0(this.f156228x, newTags.icon);
        this.f156229y.setText(newTags.name);
        this.f156230z.setText(m176278q(newTags.localTagUserCounts));
        m176282u(this.f156227w, newTags.f20457id);
        m176281t(this.f156227w, newTags.f20457id);
    }

    /* JADX INFO: renamed from: F */
    public void m176271F(List<NewTags> list) {
        if (list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            m176274I(4, 4, 4, 4, 4);
            xdl0.m208384k0(this.f156205a);
            return;
        }
        if (size == 1) {
            m176274I(0, 4, 4, 4, 4);
            m176266A(list.get(0));
            xdl0.m208384k0(this.f156205a);
            return;
        }
        if (size == 2) {
            m176274I(0, 0, 4, 4, 4);
            m176266A(list.get(0));
            m176267B(list.get(1));
            xdl0.m208384k0(this.f156205a);
            return;
        }
        if (size == 3) {
            m176274I(0, 0, 0, 4, 4);
            m176266A(list.get(0));
            m176267B(list.get(1));
            m176268C(list.get(2));
            xdl0.m208384k0(this.f156205a);
            return;
        }
        if (size == 4) {
            m176274I(0, 0, 0, 0, 4);
            m176266A(list.get(0));
            m176267B(list.get(1));
            m176268C(list.get(2));
            m176269D(list.get(3));
            xdl0.m208384k0(this.f156205a);
            return;
        }
        if (size != 5) {
            return;
        }
        m176274I(0, 0, 0, 0, 0);
        m176266A(list.get(0));
        m176267B(list.get(1));
        m176268C(list.get(2));
        m176269D(list.get(3));
        m176270E(list.get(4));
        xdl0.m208384k0(this.f156205a);
    }

    /* JADX INFO: renamed from: G */
    public void m176272G(List<String> list, List<String> list2) {
        if (list == null || list.size() == 0) {
            return;
        }
        User userMo223809clone = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        userMo223809clone.profile.extensions.interest.tags = list;
        List<String> listMo33424Ts = CoreModule.m29935P().m94651a().mo33424Ts(list.subList(0, Math.min(list.size(), 10)));
        userMo223809clone.profile.tags = vwb.m200303Q(listMo33424Ts, new w9j() { // from class: l.nsh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qsh0.m176262l((String) obj);
            }
        });
        User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169520na());
        if (NullChecker.m81303a(userSubtract)) {
            this.f156197C.mo36764z1(CoreModule.f17545c.f19639e0.m169547u9(userSubtract)).subscribe(mkd0.m154956H(new e30() { // from class: l.osh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145396a.m176286z((roj0) obj);
                }
            }, new e30() { // from class: l.psh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    qsh0.m176259i((Throwable) obj);
                }
            }));
        } else {
            this.f156204J = true;
            this.f156202H.call(SwipeDirection.RIGHT);
            osi0.m165783g("已添加");
            CoreModule.f17545c.f19663m0.f19402c2.add("e_card_add_operation_tag_button");
        }
        m176277p(list2);
    }

    /* JADX INFO: renamed from: H */
    public void m176273H(List<NewTags> list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i3 = size / i2;
        if (size % i2 == 0) {
            i3--;
        }
        if (i > i3) {
            this.f156199E = 0;
        } else {
            this.f156199E = i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = this.f156199E * i2; i4 < list.size() && i4 >= 0 && i4 < (this.f156199E + 1) * i2; i4++) {
            arrayList.add(list.get(i4));
        }
        if (i != 0 && arrayList.size() < i2) {
            int size2 = i2 - arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList.add(list.get(i5));
            }
        }
        m176271F(arrayList);
    }

    /* JADX INFO: renamed from: I */
    public void m176274I(int i, int i2, int i3, int i4, int i5) {
        this.f156211g.setVisibility(i);
        this.f156215k.setVisibility(i2);
        this.f156219o.setVisibility(i3);
        this.f156223s.setVisibility(i4);
        boolean z = this.f156198D;
        ConstraintLayout constraintLayout = this.f156227w;
        if (z) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(i5);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m176275J() {
        boolean zIsEmpty = this.f156201G.isEmpty();
        VText vText = this.f156195A;
        if (zIsEmpty) {
            vText.setBackground(CoreModule.f17544b.getResources().getDrawable(z2c0.f201199g));
            this.f156195A.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195292d));
        } else {
            vText.setBackground(CoreModule.f17544b.getResources().getDrawable(z2c0.f201199g));
            this.f156195A.setTextColor(CoreModule.f17544b.getResources().getColor(y0c0.f195294f));
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewM176276o = m176276o(layoutInflater, viewGroup);
        m176274I(4, 4, 4, 4, 4);
        int iMo36755l1 = (this.f156197C.mo36755l1() / 2) - ikf0.m136789c(114.0f);
        this.f156217m.setMaxWidth(iMo36755l1);
        this.f156218n.setMaxWidth(iMo36755l1);
        this.f156221q.setMaxWidth(iMo36755l1);
        this.f156222r.setMaxWidth(iMo36755l1);
        int iMo36755l2 = this.f156197C.mo36755l1() - ikf0.m136789c(142.0f);
        this.f156213i.setMaxWidth(iMo36755l2);
        this.f156226v.setMaxWidth(iMo36755l2);
        this.f156229y.setMaxWidth(iMo36755l2);
        return viewM176276o;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (partialListOptM221515e == null) {
            return;
        }
        m176279r();
        CoreSuggested.UserInfo userInfo = partialListOptM221515e.loaded.get(i);
        if (NullChecker.m81303a(userInfo)) {
            Object obj = userInfo.extensionObject;
            if (obj instanceof OMSAdCardInfo) {
                OmsTagCard omsTagCard = ((OMSAdCardInfo) obj).content.tagCard;
                List<Media> list = omsTagCard.pictures;
                if (!list.isEmpty()) {
                    qib0.f154691G.m102331L0(this.f156206b, CoreModule.m29935P().m94651a().mo33427Ub(list.get(0)));
                }
                this.f156208d.setText(omsTagCard.title);
                this.f156209e.setText(omsTagCard.subTitle);
                this.f156195A.setTypeface(Typeface.DEFAULT_BOLD);
                final boolean zMo33285Ak = CoreModule.m29935P().m94651a().mo33285Ak(omsTagCard.tagUserCounts);
                final List<NewTags> listMo33463ai = CoreModule.m29935P().m94651a().mo33463ai(omsTagCard.tagUserCounts);
                this.f156200F = this.f156198D ? 4 : 5;
                if (zMo33285Ak) {
                    int size = listMo33463ai.size();
                    int i2 = this.f156200F;
                    TextView textView = this.f156196B;
                    if (size <= i2) {
                        textView.setVisibility(8);
                        m176271F(listMo33463ai);
                    } else {
                        textView.setVisibility(0);
                        m176273H(listMo33463ai, 0, this.f156200F);
                    }
                }
                this.f156196B.setOnClickListener(new View.OnClickListener() { // from class: l.ksh0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.f124478a.m176283v(zMo33285Ak, listMo33463ai, view3);
                    }
                });
            }
        }
        if (i == 0) {
            this.f156197C.mo36742O3();
            if (NullChecker.m81303a(userInfo)) {
                Object obj2 = userInfo.extensionObject;
                if (obj2 instanceof OMSAdCardInfo) {
                    OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj2;
                    ic50.m135327j().m135333f().m145239Z(oMSAdCardInfo.identifier, 0, false);
                    jb0.m140733k(oMSAdCardInfo);
                    if (System.currentTimeMillis() - this.f156203I > 500 && !this.f156204J) {
                        this.f156203I = System.currentTimeMillis();
                        zvf0.m220402x("e_card_add_operation_tag_button", "p_suggest_users_home_view");
                    }
                }
            }
            xdl0.m208329E0(this.f156195A, new View.OnClickListener() { // from class: l.lsh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f129868a.m176284w(view3);
                }
            });
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: o */
    public View m176276o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rsh0.m180669b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public void m176277p(List<String> list) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean zMo33318F9 = CoreModule.m29935P().m94651a().mo33318F9(list);
        List<NewTags> listMo33359La = CoreModule.m29935P().m94651a().mo33359La(list);
        if (zMo33318F9 && !listMo33359La.isEmpty()) {
            for (NewTags newTags : listMo33359La) {
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
        zvf0.m220399u("e_card_add_operation_tag_button", "p_suggest_users_home_view", vwb.m200311Y("personal_tag_category", sb.toString()), vwb.m200311Y("personal_tag_name", sb2.toString()));
    }

    /* JADX INFO: renamed from: q */
    public String m176278q(long j) {
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
    public void m176279r() {
        if (ikf0.m136795i(this.f156197C.mo36757p0()) < 600.0f) {
            this.f156198D = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m176280s() {
        List<String> list = CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.interest.tags;
        return CoreModule.m29935P().m94651a().mo33318F9(list) && CoreModule.m29935P().m94651a().mo33359La(list).size() + this.f156201G.size() >= 200;
    }

    /* JADX INFO: renamed from: t */
    public void m176281t(final ConstraintLayout constraintLayout, final String str) {
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: l.msh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135498a.m176285x(str, constraintLayout, view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m176282u(ConstraintLayout constraintLayout, String str) {
        if (this.f156201G.contains(str)) {
            constraintLayout.setBackground(CoreModule.f17544b.getResources().getDrawable(z2c0.f201200h));
        } else {
            constraintLayout.setBackground(CoreModule.f17544b.getResources().getDrawable(z2c0.f201201i));
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m176283v(boolean z, List list, View view) {
        if (z) {
            m176273H(list, this.f156199E + 1, this.f156200F);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m176284w(View view) {
        if (!Network.isConnected(this.f156197C.mo36758q1())) {
            osi0.m165783g("网络无法连接");
            return;
        }
        if (this.f156201G.size() >= 1) {
            List<String> arrayList = new ArrayList<>(CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.interest.tags);
            boolean zIsEmpty = arrayList.isEmpty();
            List<String> list = this.f156201G;
            if (zIsEmpty) {
                arrayList = list;
            } else {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.remove(it.next());
                }
                arrayList.addAll(0, this.f156201G);
            }
            if (arrayList.size() < 5) {
                osi0.m165783g("请至少选择5个标签");
            } else {
                m176272G(arrayList, this.f156201G);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m176285x(String str, ConstraintLayout constraintLayout, View view) {
        if (this.f156201G.contains(str)) {
            this.f156201G.remove(str);
        } else if (m176280s()) {
            osi0.m165783g("选择的数量达到标签上限");
        } else {
            this.f156201G.add(str);
        }
        m176282u(constraintLayout, str);
        m176275J();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m176286z(roj0 roj0Var) {
        this.f156204J = true;
        this.f156202H.call(SwipeDirection.RIGHT);
        osi0.m165783g("已添加");
        CoreModule.f17545c.f19663m0.f19402c2.add("e_card_add_operation_tag_button");
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
