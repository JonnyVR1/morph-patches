package p002l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import l.e30;
import l.j760;
import l.mcr;
import l.rza;
import l.t100;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x9j;
import l.xdl0;
import l.xq90;
import v.VLinear_Dividers;
import v.VText;
import v.VText_Tags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wq90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText_Tags f21912A;

    /* JADX INFO: renamed from: B */
    public VText_Tags f21913B;

    /* JADX INFO: renamed from: C */
    public HashSet<String> f21914C;

    /* JADX INFO: renamed from: D */
    public ImageView f21915D;

    /* JADX INFO: renamed from: E */
    public ImageView f21916E;

    /* JADX INFO: renamed from: F */
    public ImageView f21917F;

    /* JADX INFO: renamed from: G */
    public ImageView f21918G;

    /* JADX INFO: renamed from: H */
    public ImageView f21919H;

    /* JADX INFO: renamed from: I */
    public ImageView f21920I;

    /* JADX INFO: renamed from: J */
    public List<j760<Integer, String>> f21921J;

    /* JADX INFO: renamed from: K */
    public final String[] f21922K;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f21923u;

    /* JADX INFO: renamed from: v */
    public VText f21924v;

    /* JADX INFO: renamed from: w */
    public VText_Tags f21925w;

    /* JADX INFO: renamed from: x */
    public VText_Tags f21926x;

    /* JADX INFO: renamed from: y */
    public VText_Tags f21927y;

    /* JADX INFO: renamed from: z */
    public VText_Tags f21928z;

    public wq90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f21914C = new HashSet<>();
        for (String str : Profile.TAG_CATEGORIES) {
            if (!"personality".equals(str)) {
                this.f21914C.add(str);
            }
        }
        this.f21921J = new ArrayList();
        this.f21922K = new String[]{"sports", "music", "food", "movies", "literature", "places"};
    }

    /* JADX INFO: renamed from: Z */
    private void m25310Z() {
        vwb.z(vwb.f0(new VText_Tags[]{this.f21925w, this.f21926x, this.f21912A, this.f21928z, this.f21927y, this.f21913B}), new e30() { // from class: l.oq90
            public final void call(Object obj) {
                this.f16743a.m25314c0((VText_Tags) obj);
            }
        });
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: Y */
    public View m25311Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xq90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a0 */
    public final ArrayList<Tag> m25312a0() {
        return vwb.n(mo3351O().mo1517K2().profile.tags, new w9j() { // from class: l.rq90
            public final Object call(Object obj) {
                return this.f18642a.m25315d0((Tag) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ boolean m25313b0(VText_Tags vText_Tags, View view) {
        CoreDlg.b(mo3351O().act(), vText_Tags.getText() instanceof Spanned ? rza.U0((Spanned) vText_Tags.getText()) : vText_Tags.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m25314c0(final VText_Tags vText_Tags) {
        if (!mo3351O().mo1570m0()) {
            vText_Tags.setBackgroundDrawable((Drawable) null);
        }
        vText_Tags.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.vq90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f21264a.m25313b0(vText_Tags, view);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Boolean m25315d0(Tag tag) {
        return Boolean.valueOf(this.f21914C.contains(tag.category));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ SpannableStringBuilder m25316e0(List list, List list2, Integer num, Boolean bool) {
        return m9643H(list, num, bool, list2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m25317f0(User user) {
        ArrayList arrayList;
        List<Tag> listN = user.profile.tags;
        if (mo3351O().mo1523P1()) {
            arrayList = new ArrayList();
        } else {
            final List list = mo3351O().mo2827me().profile.tags;
            Objects.requireNonNull(list);
            ArrayList arrayListN = vwb.n(listN, new w9j() { // from class: l.pq90
                public final Object call(Object obj) {
                    return Boolean.valueOf(list.contains((Tag) obj));
                }
            });
            listN = vwb.n(listN, new w9j() { // from class: l.qq90
                public final Object call(Object obj) {
                    return Boolean.valueOf(!list.contains((Tag) obj));
                }
            });
            arrayList = arrayListN;
        }
        m25318g0(listN, arrayList, new VText_Tags[]{this.f21925w, this.f21926x, this.f21927y, this.f21928z, this.f21912A, this.f21913B});
    }

    /* JADX INFO: renamed from: g0 */
    public final void m25318g0(List<Tag> list, List<Tag> list2, VText_Tags[] vText_TagsArr) {
        this.f21921J.clear();
        for (int i = 0; i < vText_TagsArr.length; i++) {
            final String str = this.f21922K[i];
            final ArrayList arrayListN = vwb.n(list2, new w9j() { // from class: l.sq90
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            final ArrayList arrayListN2 = vwb.n(list, new w9j() { // from class: l.tq90
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            vText_TagsArr[i].setTypeface(Typeface.DEFAULT_BOLD);
            vText_TagsArr[i].setTags(new x9j() { // from class: l.uq90
                public final Object call(Object obj, Object obj2) {
                    return this.f20751a.m25316e0(arrayListN, arrayListN2, (Integer) obj, (Boolean) obj2);
                }
            });
            if (arrayListN.isEmpty() && arrayListN2.isEmpty() && !mo3351O().mo1570m0()) {
                m9651Q(vText_TagsArr[i], 8);
            } else {
                m9651Q(vText_TagsArr[i], 0);
            }
            if (mo3351O().mo1570m0()) {
                ArrayList arrayList = new ArrayList();
                if (!vwb.J(arrayListN)) {
                    arrayList.addAll(arrayListN);
                }
                if (!vwb.J(arrayListN2)) {
                    arrayList.addAll(arrayListN2);
                }
                if (TextUtils.equals(str, "sports")) {
                    xdl0.c0(this.f21924v, t100.d(arrayList.size() > 0 ? 12.0f : 4.0f));
                }
            }
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f21924v.setTextColor(mo3351O().act().getResources().getColor(w0c0.P1));
        if (mo3351O().mo1570m0()) {
            return;
        }
        m25310Z();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if (mo3351O().mo1570m0() || vwb.J(m25312a0())) {
            return false;
        }
        List list = mo3351O().mo1517K2().profile.extensions.interest.tags;
        mo3351O().mo1523P1();
        return true;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m25311Y(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m25317f0(mo3351O().mo1517K2());
    }
}
