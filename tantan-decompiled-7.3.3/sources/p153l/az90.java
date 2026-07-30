package p153l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class az90 extends ep90 {

    /* JADX INFO: renamed from: A */
    public VText_Tags f74103A;

    /* JADX INFO: renamed from: B */
    public VText_Tags f74104B;

    /* JADX INFO: renamed from: C */
    public HashSet<String> f74105C;

    /* JADX INFO: renamed from: D */
    public ImageView f74106D;

    /* JADX INFO: renamed from: E */
    public ImageView f74107E;

    /* JADX INFO: renamed from: F */
    public ImageView f74108F;

    /* JADX INFO: renamed from: G */
    public ImageView f74109G;

    /* JADX INFO: renamed from: H */
    public ImageView f74110H;

    /* JADX INFO: renamed from: I */
    public ImageView f74111I;

    /* JADX INFO: renamed from: J */
    public List<pf60<Integer, String>> f74112J;

    /* JADX INFO: renamed from: K */
    public final String[] f74113K;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f74114u;

    /* JADX INFO: renamed from: v */
    public VText f74115v;

    /* JADX INFO: renamed from: w */
    public VText_Tags f74116w;

    /* JADX INFO: renamed from: x */
    public VText_Tags f74117x;

    /* JADX INFO: renamed from: y */
    public VText_Tags f74118y;

    /* JADX INFO: renamed from: z */
    public VText_Tags f74119z;

    public az90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f74105C = new HashSet<>();
        for (String str : Profile.TAG_CATEGORIES) {
            if (!"personality".equals(str)) {
                this.f74105C.add(str);
            }
        }
        this.f74112J = new ArrayList();
        this.f74113K = new String[]{"sports", "music", "food", "movies", "literature", "places"};
    }

    /* JADX INFO: renamed from: Z */
    private void m101025Z() {
        jyb.m147537z(jyb.m147507f0(this.f74116w, this.f74117x, this.f74103A, this.f74119z, this.f74118y, this.f74104B), new y20() { // from class: l.sy90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171218a.m101029c0((VText_Tags) obj);
            }
        });
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: Y */
    public View m101026Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bz90.m107137b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a0 */
    public final ArrayList<Tag> m101027a0() {
        return jyb.m147522n(mo53983O().mo52252K2().profile.tags, new qcj() { // from class: l.vy90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186347a.m101030d0((Tag) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ boolean m101028b0(VText_Tags vText_Tags, View view) {
        CoreDlg.m46231b(mo53983O().act(), vText_Tags.getText() instanceof Spanned ? e1b.m118963U0((Spanned) vText_Tags.getText()) : vText_Tags.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m101029c0(final VText_Tags vText_Tags) {
        if (!mo53983O().mo52302m0()) {
            vText_Tags.setBackgroundDrawable(null);
        }
        vText_Tags.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.zy90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f206565a.m101028b0(vText_Tags, view);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Boolean m101030d0(Tag tag) {
        return Boolean.valueOf(this.f74105C.contains(tag.category));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ SpannableStringBuilder m101031e0(List list, List list2, Integer num, Boolean bool) {
        return m121837H(list, num, bool, list2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m101032f0(User user) {
        ArrayList arrayList;
        List<Tag> listM147522n = user.profile.tags;
        if (mo53983O().mo52258P1()) {
            arrayList = new ArrayList();
        } else {
            final List<Tag> list = mo53983O().mo53478me().profile.tags;
            Objects.requireNonNull(list);
            ArrayList arrayListM147522n = jyb.m147522n(listM147522n, new qcj() { // from class: l.ty90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(list.contains((Tag) obj));
                }
            });
            listM147522n = jyb.m147522n(listM147522n, new qcj() { // from class: l.uy90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!list.contains((Tag) obj));
                }
            });
            arrayList = arrayListM147522n;
        }
        m101033g0(listM147522n, arrayList, new VText_Tags[]{this.f74116w, this.f74117x, this.f74118y, this.f74119z, this.f74103A, this.f74104B});
    }

    /* JADX INFO: renamed from: g0 */
    public final void m101033g0(List<Tag> list, List<Tag> list2, VText_Tags[] vText_TagsArr) {
        this.f74112J.clear();
        for (int i = 0; i < vText_TagsArr.length; i++) {
            final String str = this.f74113K[i];
            final ArrayList arrayListM147522n = jyb.m147522n(list2, new qcj() { // from class: l.wy90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            final ArrayList arrayListM147522n2 = jyb.m147522n(list, new qcj() { // from class: l.xy90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            vText_TagsArr[i].setTypeface(Typeface.DEFAULT_BOLD);
            vText_TagsArr[i].setTags(new rcj() { // from class: l.yy90
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return this.f202088a.m101031e0(arrayListM147522n, arrayListM147522n2, (Integer) obj, (Boolean) obj2);
                }
            });
            if (arrayListM147522n.isEmpty() && arrayListM147522n2.isEmpty() && !mo53983O().mo52302m0()) {
                m121845Q(vText_TagsArr[i], 8);
            } else {
                m121845Q(vText_TagsArr[i], 0);
            }
            if (mo53983O().mo52302m0()) {
                ArrayList arrayList = new ArrayList();
                if (!jyb.m147479J(arrayListM147522n)) {
                    arrayList.addAll(arrayListM147522n);
                }
                if (!jyb.m147479J(arrayListM147522n2)) {
                    arrayList.addAll(arrayListM147522n2);
                }
                if (TextUtils.equals(str, "sports")) {
                    bnl0.m105548c0(this.f74115v, qa00.m175859d(arrayList.size() > 0 ? 12.0f : 4.0f));
                }
            }
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f74115v.setTextColor(mo53983O().act().getResources().getColor(c9c0.f80368Q1));
        if (mo53983O().mo52302m0()) {
            return;
        }
        m101025Z();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        if (mo53983O().mo52302m0() || jyb.m147479J(m101027a0())) {
            return false;
        }
        List<String> list = mo53983O().mo52252K2().profile.extensions.interest.tags;
        mo53983O().mo52258P1();
        return true;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m101026Y(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m101032f0(mo53983O().mo52252K2());
    }
}
