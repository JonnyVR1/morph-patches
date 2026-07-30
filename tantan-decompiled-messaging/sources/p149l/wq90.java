package p149l;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class wq90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText_Tags f187653A;

    /* JADX INFO: renamed from: B */
    public VText_Tags f187654B;

    /* JADX INFO: renamed from: C */
    public HashSet<String> f187655C;

    /* JADX INFO: renamed from: D */
    public ImageView f187656D;

    /* JADX INFO: renamed from: E */
    public ImageView f187657E;

    /* JADX INFO: renamed from: F */
    public ImageView f187658F;

    /* JADX INFO: renamed from: G */
    public ImageView f187659G;

    /* JADX INFO: renamed from: H */
    public ImageView f187660H;

    /* JADX INFO: renamed from: I */
    public ImageView f187661I;

    /* JADX INFO: renamed from: J */
    public List<j760<Integer, String>> f187662J;

    /* JADX INFO: renamed from: K */
    public final String[] f187663K;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f187664u;

    /* JADX INFO: renamed from: v */
    public VText f187665v;

    /* JADX INFO: renamed from: w */
    public VText_Tags f187666w;

    /* JADX INFO: renamed from: x */
    public VText_Tags f187667x;

    /* JADX INFO: renamed from: y */
    public VText_Tags f187668y;

    /* JADX INFO: renamed from: z */
    public VText_Tags f187669z;

    public wq90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f187655C = new HashSet<>();
        for (String str : Profile.TAG_CATEGORIES) {
            if (!"personality".equals(str)) {
                this.f187655C.add(str);
            }
        }
        this.f187662J = new ArrayList();
        this.f187663K = new String[]{"sports", "music", "food", "movies", "literature", "places"};
    }

    /* JADX INFO: renamed from: Z */
    private void m205043Z() {
        vwb.m200354z(vwb.m200324f0(this.f187666w, this.f187667x, this.f187653A, this.f187669z, this.f187668y, this.f187654B), new e30() { // from class: l.oq90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145114a.m205047c0((VText_Tags) obj);
            }
        });
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: Y */
    public View m205044Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xq90.m210561b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a0 */
    public final ArrayList<Tag> m205045a0() {
        return vwb.m200339n(mo52800O().mo51069K2().profile.tags, new w9j() { // from class: l.rq90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f160599a.m205048d0((Tag) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ boolean m205046b0(VText_Tags vText_Tags, View view) {
        CoreDlg.m45048b(mo52800O().act(), vText_Tags.getText() instanceof Spanned ? rza.m181741U0((Spanned) vText_Tags.getText()) : vText_Tags.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m205047c0(final VText_Tags vText_Tags) {
        if (!mo52800O().mo51119m0()) {
            vText_Tags.setBackgroundDrawable(null);
        }
        vText_Tags.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.vq90
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f182617a.m205046b0(vText_Tags, view);
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Boolean m205048d0(Tag tag) {
        return Boolean.valueOf(this.f187655C.contains(tag.category));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ SpannableStringBuilder m205049e0(List list, List list2, Integer num, Boolean bool) {
        return m96412H(list, num, bool, list2);
    }

    /* JADX INFO: renamed from: f0 */
    public void m205050f0(User user) {
        ArrayList arrayList;
        List<Tag> listM200339n = user.profile.tags;
        if (mo52800O().mo51075P1()) {
            arrayList = new ArrayList();
        } else {
            final List<Tag> list = mo52800O().mo52295me().profile.tags;
            Objects.requireNonNull(list);
            ArrayList arrayListM200339n = vwb.m200339n(listM200339n, new w9j() { // from class: l.pq90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(list.contains((Tag) obj));
                }
            });
            listM200339n = vwb.m200339n(listM200339n, new w9j() { // from class: l.qq90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!list.contains((Tag) obj));
                }
            });
            arrayList = arrayListM200339n;
        }
        m205051g0(listM200339n, arrayList, new VText_Tags[]{this.f187666w, this.f187667x, this.f187668y, this.f187669z, this.f187653A, this.f187654B});
    }

    /* JADX INFO: renamed from: g0 */
    public final void m205051g0(List<Tag> list, List<Tag> list2, VText_Tags[] vText_TagsArr) {
        this.f187662J.clear();
        for (int i = 0; i < vText_TagsArr.length; i++) {
            final String str = this.f187663K[i];
            final ArrayList arrayListM200339n = vwb.m200339n(list2, new w9j() { // from class: l.sq90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            final ArrayList arrayListM200339n2 = vwb.m200339n(list, new w9j() { // from class: l.tq90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Tag) obj).category.equals(str));
                }
            });
            vText_TagsArr[i].setTypeface(Typeface.DEFAULT_BOLD);
            vText_TagsArr[i].setTags(new x9j() { // from class: l.uq90
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return this.f177730a.m205049e0(arrayListM200339n, arrayListM200339n2, (Integer) obj, (Boolean) obj2);
                }
            });
            if (arrayListM200339n.isEmpty() && arrayListM200339n2.isEmpty() && !mo52800O().mo51119m0()) {
                m96420Q(vText_TagsArr[i], 8);
            } else {
                m96420Q(vText_TagsArr[i], 0);
            }
            if (mo52800O().mo51119m0()) {
                ArrayList arrayList = new ArrayList();
                if (!vwb.m200296J(arrayListM200339n)) {
                    arrayList.addAll(arrayListM200339n);
                }
                if (!vwb.m200296J(arrayListM200339n2)) {
                    arrayList.addAll(arrayListM200339n2);
                }
                if (TextUtils.equals(str, "sports")) {
                    xdl0.m208368c0(this.f187665v, t100.m186890d(arrayList.size() > 0 ? 12.0f : 4.0f));
                }
            }
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f187665v.setTextColor(mo52800O().act().getResources().getColor(w0c0.f183796P1));
        if (mo52800O().mo51119m0()) {
            return;
        }
        m205043Z();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if (mo52800O().mo51119m0() || vwb.m200296J(m205045a0())) {
            return false;
        }
        List<String> list = mo52800O().mo51069K2().profile.extensions.interest.tags;
        mo52800O().mo51075P1();
        return true;
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m205044Y(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m205050f0(mo52800O().mo51069K2());
    }
}
