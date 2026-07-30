package p149l;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.Tag;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class cua0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f82544u;

    /* JADX INFO: renamed from: v */
    public VText f82545v;

    /* JADX INFO: renamed from: w */
    public VText_Tags f82546w;

    /* JADX INFO: renamed from: x */
    public List<Tag> f82547x;

    public cua0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f82547x = new ArrayList();
    }

    /* JADX INFO: renamed from: Y */
    private void m108733Y() {
        vwb.m200354z(vwb.m200324f0(this.f82546w), new e30() { // from class: l.vta0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182917a.m108738a0((VText_Tags) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ SpannableStringBuilder m108734b0(List list, List list2, Integer num, Boolean bool) {
        return m96412H(list, num, bool, list2);
    }

    /* JADX INFO: renamed from: d0 */
    private ArrayList<Tag> m108735d0() {
        return vwb.m200339n(mo52800O().mo51069K2().profile.tags, new w9j() { // from class: l.wta0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: X */
    public View m108736X(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dua0.m113677b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean m108737Z(VText_Tags vText_Tags, View view) {
        CoreDlg.m45048b(mo52800O().act(), vText_Tags.getText() instanceof Spanned ? rza.m181741U0((Spanned) vText_Tags.getText()) : vText_Tags.getText().toString());
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m108738a0(final VText_Tags vText_Tags) {
        if (!mo52800O().mo51119m0()) {
            vText_Tags.setBackgroundDrawable(null);
        }
        vText_Tags.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.xta0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f194363a.m108737Z(vText_Tags, view);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public ArrayList<Tag> mo108739c0() {
        return vwb.m200339n(mo52800O().mo52295me().profile.tags, new w9j() { // from class: l.bua0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public void m108740e0() {
        final ArrayList arrayList;
        this.f82547x.clear();
        final ArrayList<Tag> arrayListMo108739c0 = mo108739c0();
        ArrayList<Tag> arrayListM108735d0 = m108735d0();
        if (mo52800O().mo51075P1()) {
            arrayList = new ArrayList();
        } else {
            Objects.requireNonNull(arrayListMo108739c0);
            ArrayList arrayListM200339n = vwb.m200339n(arrayListM108735d0, new yta0(arrayListMo108739c0));
            arrayListMo108739c0 = vwb.m200339n(arrayListM108735d0, new w9j() { // from class: l.zta0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!arrayListMo108739c0.contains((Tag) obj));
                }
            });
            arrayList = arrayListM200339n;
        }
        if (!vwb.m200296J(arrayList)) {
            this.f82547x.addAll(arrayList);
        }
        if (!vwb.m200296J(arrayListMo108739c0)) {
            this.f82547x.addAll(arrayListMo108739c0);
        }
        this.f82546w.setTags(new x9j() { // from class: l.aua0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f71739a.m108734b0(arrayList, arrayListMo108739c0, (Integer) obj, (Boolean) obj2);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f82545v.setTextColor(mo52800O().act().getResources().getColor(w0c0.f183796P1));
        if (mo52800O().mo51119m0()) {
            return;
        }
        m108733Y();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if (mo52800O().mo51119m0() || vwb.m200296J(m108735d0())) {
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
        return m108736X(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m108740e0();
    }
}
