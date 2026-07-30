package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.FilterItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class oii extends dac0<zii> {

    /* JADX INFO: renamed from: c */
    public final List<zii> f144123c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC18942a f144124d;

    /* JADX INFO: renamed from: l.oii$a */
    public interface InterfaceC18942a {
        /* JADX INFO: renamed from: a */
        void mo125997a(zii ziiVar, int i);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f144123c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        FilterItemView filterItemView = new FilterItemView(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, t100.m186890d(36.0f));
        marginLayoutParams.rightMargin = t100.m186890d(8.0f);
        filterItemView.setLayoutParams(marginLayoutParams);
        return filterItemView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final zii ziiVar, int i, final int i2) {
        ((FilterItemView) view).m39376b(ziiVar);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.nii
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f139100a.m164516H(ziiVar, i2, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public zii getItem(int i) {
        return this.f144123c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m164516H(zii ziiVar, int i, View view) {
        InterfaceC18942a interfaceC18942a = this.f144124d;
        if (interfaceC18942a != null) {
            interfaceC18942a.mo125997a(ziiVar, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m164517I(List<zii> list) {
        this.f144123c.clear();
        if (list != null) {
            this.f144123c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m164518J(InterfaceC18942a interfaceC18942a) {
        this.f144124d = interfaceC18942a;
    }

    /* JADX INFO: renamed from: K */
    public void m164519K(int i) {
        if (i < 0 || i >= this.f144123c.size()) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f144123c.size()) {
            this.f144123c.get(i2).f203332c = i2 == i;
            i2++;
        }
        notifyDataSetChanged();
    }
}
