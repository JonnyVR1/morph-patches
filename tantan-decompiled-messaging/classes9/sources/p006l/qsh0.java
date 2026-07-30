package p006l;

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
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.TagCategories;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.p1.mobile.putong.data.OmsTagCard;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.eyl;
import l.ic50;
import l.ikf0;
import l.j760;
import l.mkd0;
import l.ool0;
import l.osi0;
import l.roj0;
import l.rsh0;
import l.t7m;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qsh0 implements ool0 {

    /* JADX INFO: renamed from: A */
    public VText f20008A;

    /* JADX INFO: renamed from: B */
    public TextView f20009B;

    /* JADX INFO: renamed from: C */
    public eyl f20010C;

    /* JADX INFO: renamed from: F */
    public int f20013F;

    /* JADX INFO: renamed from: a */
    public FrameLayout f20018a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f20019b;

    /* JADX INFO: renamed from: c */
    public ImageView f20020c;

    /* JADX INFO: renamed from: d */
    public TextView f20021d;

    /* JADX INFO: renamed from: e */
    public TextView f20022e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f20023f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f20024g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f20025h;

    /* JADX INFO: renamed from: i */
    public VText f20026i;

    /* JADX INFO: renamed from: j */
    public VText f20027j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f20028k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f20029l;

    /* JADX INFO: renamed from: m */
    public VText f20030m;

    /* JADX INFO: renamed from: n */
    public VText f20031n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f20032o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f20033p;

    /* JADX INFO: renamed from: q */
    public VText f20034q;

    /* JADX INFO: renamed from: r */
    public VText f20035r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f20036s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f20037t;

    /* JADX INFO: renamed from: u */
    public VText f20038u;

    /* JADX INFO: renamed from: v */
    public VText f20039v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f20040w;

    /* JADX INFO: renamed from: x */
    public VDraweeView f20041x;

    /* JADX INFO: renamed from: y */
    public VText f20042y;

    /* JADX INFO: renamed from: z */
    public VText f20043z;

    /* JADX INFO: renamed from: D */
    public boolean f20011D = false;

    /* JADX INFO: renamed from: E */
    public int f20012E = 0;

    /* JADX INFO: renamed from: G */
    public List<String> f20014G = new ArrayList();

    /* JADX INFO: renamed from: H */
    public e30<SwipeDirection> f20015H = new e30() { // from class: l.jsh0
        public final void call(Object obj) {
            this.f15375a.m22342y((SwipeDirection) obj);
        }
    };

    /* JADX INFO: renamed from: I */
    public long f20016I = 0;

    /* JADX INFO: renamed from: J */
    public boolean f20017J = false;

    public qsh0(eyl eylVar) {
        this.f20010C = eylVar;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m22336i(Throwable th) {
        if (yij0.H(th)) {
            return;
        }
        osi0.g("保存失败");
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Tag m22339l(String str) {
        return new Tag("personality", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m22342y(SwipeDirection swipeDirection) {
        this.f20010C.V(SwipeDirection.fromValue(swipeDirection.getValue()));
    }

    /* JADX INFO: renamed from: A */
    public void m22343A(NewTags newTags) {
        qib0.f19782G.m12744L0(this.f20025h, newTags.icon);
        this.f20026i.setText(newTags.name);
        this.f20027j.setText(m22361q(newTags.localTagUserCounts));
        m22365u(this.f20024g, newTags.id);
        m22364t(this.f20024g, newTags.id);
    }

    /* JADX INFO: renamed from: B */
    public void m22344B(NewTags newTags) {
        qib0.f19782G.m12744L0(this.f20029l, newTags.icon);
        this.f20030m.setText(newTags.name);
        this.f20031n.setText(m22361q(newTags.localTagUserCounts));
        m22365u(this.f20028k, newTags.id);
        m22364t(this.f20028k, newTags.id);
    }

    /* JADX INFO: renamed from: C */
    public void m22345C(NewTags newTags) {
        qib0.f19782G.m12744L0(this.f20033p, newTags.icon);
        this.f20034q.setText(newTags.name);
        this.f20035r.setText(m22361q(newTags.localTagUserCounts));
        m22365u(this.f20032o, newTags.id);
        m22364t(this.f20032o, newTags.id);
    }

    /* JADX INFO: renamed from: D */
    public void m22346D(NewTags newTags) {
        qib0.f19782G.m12744L0(this.f20037t, newTags.icon);
        this.f20038u.setText(newTags.name);
        this.f20039v.setText(m22361q(newTags.localTagUserCounts));
        m22365u(this.f20036s, newTags.id);
        m22364t(this.f20036s, newTags.id);
    }

    /* JADX INFO: renamed from: E */
    public void m22347E(NewTags newTags) {
        qib0.f19782G.m12744L0(this.f20041x, newTags.icon);
        this.f20042y.setText(newTags.name);
        this.f20043z.setText(m22361q(newTags.localTagUserCounts));
        m22365u(this.f20040w, newTags.id);
        m22364t(this.f20040w, newTags.id);
    }

    /* JADX INFO: renamed from: F */
    public void m22348F(List<NewTags> list) {
        if (list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            m22351I(4, 4, 4, 4, 4);
            xdl0.k0(this.f20018a);
            return;
        }
        if (size == 1) {
            m22351I(0, 4, 4, 4, 4);
            m22343A(list.get(0));
            xdl0.k0(this.f20018a);
            return;
        }
        if (size == 2) {
            m22351I(0, 0, 4, 4, 4);
            m22343A(list.get(0));
            m22344B(list.get(1));
            xdl0.k0(this.f20018a);
            return;
        }
        if (size == 3) {
            m22351I(0, 0, 0, 4, 4);
            m22343A(list.get(0));
            m22344B(list.get(1));
            m22345C(list.get(2));
            xdl0.k0(this.f20018a);
            return;
        }
        if (size == 4) {
            m22351I(0, 0, 0, 0, 4);
            m22343A(list.get(0));
            m22344B(list.get(1));
            m22345C(list.get(2));
            m22346D(list.get(3));
            xdl0.k0(this.f20018a);
            return;
        }
        if (size != 5) {
            return;
        }
        m22351I(0, 0, 0, 0, 0);
        m22343A(list.get(0));
        m22344B(list.get(1));
        m22345C(list.get(2));
        m22346D(list.get(3));
        m22347E(list.get(4));
        xdl0.k0(this.f20018a);
    }

    /* JADX INFO: renamed from: G */
    public void m22349G(List<String> list, List<String> list2) {
        if (list == null || list.size() == 0) {
            return;
        }
        User userClone = CoreModule.f1534c.f3628e0.m21483na().clone();
        userClone.profile.extensions.interest.tags = list;
        List<String> listM5361Ts = CoreModule.m1854P().m11706a().m5361Ts(list.subList(0, Math.min(list.size(), 10)));
        userClone.profile.tags = vwb.Q(listM5361Ts, new w9j() { // from class: l.nsh0
            public final Object call(Object obj) {
                return qsh0.m22339l((String) obj);
            }
        });
        User userSubtract = userClone.subtract(CoreModule.f1534c.f3628e0.m21483na());
        if (NullChecker.a(userSubtract)) {
            this.f20010C.z1(CoreModule.f1534c.f3628e0.m21510u9(userSubtract)).subscribe(mkd0.H(new e30() { // from class: l.osh0
                public final void call(Object obj) {
                    this.f18358a.m22369z((roj0) obj);
                }
            }, new e30() { // from class: l.psh0
                public final void call(Object obj) {
                    qsh0.m22336i((Throwable) obj);
                }
            }));
        } else {
            this.f20017J = true;
            this.f20015H.call(SwipeDirection.RIGHT);
            osi0.g("已添加");
            CoreModule.f1534c.f3652m0.f3391c2.add("e_card_add_operation_tag_button");
        }
        m22360p(list2);
    }

    /* JADX INFO: renamed from: H */
    public void m22350H(List<NewTags> list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i3 = size / i2;
        if (size % i2 == 0) {
            i3--;
        }
        if (i > i3) {
            this.f20012E = 0;
        } else {
            this.f20012E = i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = this.f20012E * i2; i4 < list.size() && i4 >= 0 && i4 < (this.f20012E + 1) * i2; i4++) {
            arrayList.add(list.get(i4));
        }
        if (i != 0 && arrayList.size() < i2) {
            int size2 = i2 - arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                arrayList.add(list.get(i5));
            }
        }
        m22348F(arrayList);
    }

    /* JADX INFO: renamed from: I */
    public void m22351I(int i, int i2, int i3, int i4, int i5) {
        this.f20024g.setVisibility(i);
        this.f20028k.setVisibility(i2);
        this.f20032o.setVisibility(i3);
        this.f20036s.setVisibility(i4);
        boolean z = this.f20011D;
        ConstraintLayout constraintLayout = this.f20040w;
        if (z) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(i5);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m22352J() {
        boolean zIsEmpty = this.f20014G.isEmpty();
        VText vText = this.f20008A;
        if (zIsEmpty) {
            vText.setBackground(CoreModule.f1533b.getResources().getDrawable(z2c0.f28575g));
            this.f20008A.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27840d));
        } else {
            vText.setBackground(CoreModule.f1533b.getResources().getDrawable(z2c0.f28575g));
            this.f20008A.setTextColor(CoreModule.f1533b.getResources().getColor(y0c0.f27842f));
        }
    }

    /* JADX INFO: renamed from: d */
    public View m22355d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        View viewM22359o = m22359o(layoutInflater, viewGroup);
        m22351I(4, 4, 4, 4, 4);
        int iL1 = (this.f20010C.l1() / 2) - ikf0.c(114.0f);
        this.f20030m.setMaxWidth(iL1);
        this.f20031n.setMaxWidth(iL1);
        this.f20034q.setMaxWidth(iL1);
        this.f20035r.setMaxWidth(iL1);
        int iL2 = this.f20010C.l1() - ikf0.c(142.0f);
        this.f20026i.setMaxWidth(iL2);
        this.f20039v.setMaxWidth(iL2);
        this.f20042y.setMaxWidth(iL2);
        return viewM22359o;
    }

    /* JADX INFO: renamed from: e */
    public void m22356e(View view, int i, VirtualCardType virtualCardType, View view2) {
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e();
        if (partialListOpt == null) {
            return;
        }
        m22362r();
        CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i);
        if (NullChecker.a(userInfo)) {
            Object obj = userInfo.extensionObject;
            if (obj instanceof OMSAdCardInfo) {
                OmsTagCard omsTagCard = ((OMSAdCardInfo) obj).content.tagCard;
                List list = omsTagCard.pictures;
                if (!list.isEmpty()) {
                    qib0.f19782G.m12744L0(this.f20019b, CoreModule.m1854P().m11706a().m5364Ub((Media) list.get(0)));
                }
                this.f20021d.setText(omsTagCard.title);
                this.f20022e.setText(omsTagCard.subTitle);
                this.f20008A.setTypeface(Typeface.DEFAULT_BOLD);
                final boolean zM5222Ak = CoreModule.m1854P().m11706a().m5222Ak(omsTagCard.tagUserCounts);
                final List<NewTags> listM5400ai = CoreModule.m1854P().m11706a().m5400ai(omsTagCard.tagUserCounts);
                this.f20013F = this.f20011D ? 4 : 5;
                if (zM5222Ak) {
                    int size = listM5400ai.size();
                    int i2 = this.f20013F;
                    TextView textView = this.f20009B;
                    if (size <= i2) {
                        textView.setVisibility(8);
                        m22348F(listM5400ai);
                    } else {
                        textView.setVisibility(0);
                        m22350H(listM5400ai, 0, this.f20013F);
                    }
                }
                this.f20009B.setOnClickListener(new View.OnClickListener() { // from class: l.ksh0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.f15981a.m22366v(zM5222Ak, listM5400ai, view3);
                    }
                });
            }
        }
        if (i == 0) {
            this.f20010C.O3();
            if (NullChecker.a(userInfo)) {
                Object obj2 = userInfo.extensionObject;
                if (obj2 instanceof OMSAdCardInfo) {
                    OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) obj2;
                    ic50.j().f().Z(oMSAdCardInfo.identifier, 0, false);
                    jb0.m17424k(oMSAdCardInfo);
                    if (System.currentTimeMillis() - this.f20016I > 500 && !this.f20017J) {
                        this.f20016I = System.currentTimeMillis();
                        zvf0.x("e_card_add_operation_tag_button", "p_suggest_users_home_view");
                    }
                }
            }
            xdl0.E0(this.f20008A, new View.OnClickListener() { // from class: l.lsh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f16620a.m22367w(view3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m22357f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m22358g(SwipeDirection swipeDirection, t7m t7mVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: o */
    public View m22359o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rsh0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p */
    public void m22360p(List<String> list) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean zM5255F9 = CoreModule.m1854P().m11706a().m5255F9(list);
        List<NewTags> listM5296La = CoreModule.m1854P().m11706a().m5296La(list);
        if (zM5255F9 && !listM5296La.isEmpty()) {
            for (NewTags newTags : listM5296La) {
                if (!TextUtils.isEmpty(newTags.name)) {
                    sb2.append(newTags.name);
                    sb2.append(",");
                }
                if (!newTags.localTagCategories.isEmpty()) {
                    for (TagCategories tagCategories : newTags.localTagCategories) {
                        if (!TextUtils.isEmpty(tagCategories.name)) {
                            sb.append(tagCategories.name);
                            sb.append(",");
                        }
                    }
                }
            }
        }
        zvf0.u("e_card_add_operation_tag_button", "p_suggest_users_home_view", new j760[]{vwb.Y("personal_tag_category", sb.toString()), vwb.Y("personal_tag_name", sb2.toString())});
    }

    /* JADX INFO: renamed from: q */
    public String m22361q(long j) {
        if (j < 0) {
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
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
    public void m22362r() {
        if (ikf0.i(this.f20010C.p0()) < 600.0f) {
            this.f20011D = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m22363s() {
        List<String> list = CoreModule.f1534c.f3628e0.m21490p9().profile.extensions.interest.tags;
        return CoreModule.m1854P().m11706a().m5255F9(list) && CoreModule.m1854P().m11706a().m5296La(list).size() + this.f20014G.size() >= 200;
    }

    /* JADX INFO: renamed from: t */
    public void m22364t(final ConstraintLayout constraintLayout, final String str) {
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: l.msh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17228a.m22368x(str, constraintLayout, view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public void m22365u(ConstraintLayout constraintLayout, String str) {
        if (this.f20014G.contains(str)) {
            constraintLayout.setBackground(CoreModule.f1533b.getResources().getDrawable(z2c0.f28576h));
        } else {
            constraintLayout.setBackground(CoreModule.f1533b.getResources().getDrawable(z2c0.f28577i));
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m22366v(boolean z, List list, View view) {
        if (z) {
            m22350H(list, this.f20012E + 1, this.f20013F);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m22367w(View view) {
        if (!Network.isConnected(this.f20010C.q1())) {
            osi0.g("网络无法连接");
            return;
        }
        if (this.f20014G.size() >= 1) {
            List<String> arrayList = new ArrayList<>(CoreModule.f1534c.f3628e0.m21490p9().profile.extensions.interest.tags);
            boolean zIsEmpty = arrayList.isEmpty();
            List<String> list = this.f20014G;
            if (zIsEmpty) {
                arrayList = list;
            } else {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.remove(it.next());
                }
                arrayList.addAll(0, this.f20014G);
            }
            if (arrayList.size() < 5) {
                osi0.g("请至少选择5个标签");
            } else {
                m22349G(arrayList, this.f20014G);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m22368x(String str, ConstraintLayout constraintLayout, View view) {
        if (this.f20014G.contains(str)) {
            this.f20014G.remove(str);
        } else if (m22363s()) {
            osi0.g("选择的数量达到标签上限");
        } else {
            this.f20014G.add(str);
        }
        m22365u(constraintLayout, str);
        m22352J();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m22369z(roj0 roj0Var) {
        this.f20017J = true;
        this.f20015H.call(SwipeDirection.RIGHT);
        osi0.g("已添加");
        CoreModule.f1534c.f3652m0.f3391c2.add("e_card_add_operation_tag_button");
    }

    /* JADX INFO: renamed from: b */
    public void m22353b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m22354c(View view) {
    }
}
