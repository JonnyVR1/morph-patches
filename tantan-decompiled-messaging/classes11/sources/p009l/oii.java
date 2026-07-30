package p009l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.FilterItemView;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oii extends dac0<zii> {

    /* JADX INFO: renamed from: c */
    public final List<zii> f18065c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC1079a f18066d;

    /* JADX INFO: renamed from: l.oii$a */
    public interface InterfaceC1079a {
        /* JADX INFO: renamed from: a */
        void mo14999a(zii ziiVar, int i);
    }

    /* JADX INFO: renamed from: C */
    public int m19801C() {
        return this.f18065c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m19802D(ViewGroup viewGroup, int i) {
        FilterItemView filterItemView = new FilterItemView(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, t100.d(36.0f));
        marginLayoutParams.rightMargin = t100.d(8.0f);
        filterItemView.setLayoutParams(marginLayoutParams);
        return filterItemView;
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m19800A(View view, final zii ziiVar, int i, final int i2) {
        ((FilterItemView) view).m3419b(ziiVar);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.nii
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f17485a.m19805H(ziiVar, i2, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public zii getItem(int i) {
        return this.f18065c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m19805H(zii ziiVar, int i, View view) {
        InterfaceC1079a interfaceC1079a = this.f18066d;
        if (interfaceC1079a != null) {
            interfaceC1079a.mo14999a(ziiVar, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m19806I(List<zii> list) {
        this.f18065c.clear();
        if (list != null) {
            this.f18065c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m19807J(InterfaceC1079a interfaceC1079a) {
        this.f18066d = interfaceC1079a;
    }

    /* JADX INFO: renamed from: K */
    public void m19808K(int i) {
        if (i < 0 || i >= this.f18065c.size()) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f18065c.size()) {
            this.f18065c.get(i2).f23698c = i2 == i;
            i2++;
        }
        notifyDataSetChanged();
    }
}
