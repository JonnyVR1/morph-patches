package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.FilterItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class lli extends jic0<vli> {

    /* JADX INFO: renamed from: c */
    public final List<vli> f132553c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC18410a f132554d;

    /* JADX INFO: renamed from: l.lli$a */
    public interface InterfaceC18410a {
        /* JADX INFO: renamed from: a */
        void mo130338a(vli vliVar, int i);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f132553c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        FilterItemView filterItemView = new FilterItemView(viewGroup.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, qa00.m175859d(36.0f));
        marginLayoutParams.rightMargin = qa00.m175859d(8.0f);
        filterItemView.setLayoutParams(marginLayoutParams);
        return filterItemView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final vli vliVar, int i, final int i2) {
        ((FilterItemView) view).m40379b(vliVar);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.kli
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f127371a.m154728H(vliVar, i2, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public vli getItem(int i) {
        return this.f132553c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m154728H(vli vliVar, int i, View view) {
        InterfaceC18410a interfaceC18410a = this.f132554d;
        if (interfaceC18410a != null) {
            interfaceC18410a.mo130338a(vliVar, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m154729I(List<vli> list) {
        this.f132553c.clear();
        if (list != null) {
            this.f132553c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m154730J(InterfaceC18410a interfaceC18410a) {
        this.f132554d = interfaceC18410a;
    }

    /* JADX INFO: renamed from: K */
    public void m154731K(int i) {
        if (i < 0 || i >= this.f132553c.size()) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f132553c.size()) {
            this.f132553c.get(i2).f184589c = i2 == i;
            i2++;
        }
        notifyDataSetChanged();
    }
}
