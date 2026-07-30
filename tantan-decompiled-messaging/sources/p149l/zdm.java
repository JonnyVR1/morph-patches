package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaItemView;
import com.p046p1.mobile.putong.core.p053ui.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.data.Media;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zdm extends dac0<Media> {

    /* JADX INFO: renamed from: c */
    public int f202676c;

    /* JADX INFO: renamed from: d */
    public PutongAct f202677d;

    /* JADX INFO: renamed from: e */
    public int f202678e;

    /* JADX INFO: renamed from: f */
    public boolean f202679f;

    /* JADX INFO: renamed from: g */
    public nqh0 f202680g;

    /* JADX INFO: renamed from: h */
    public boolean f202681h;

    /* JADX INFO: renamed from: i */
    public boolean f202682i;

    /* JADX INFO: renamed from: j */
    public q860<Media> f202683j = q860.m173341a();

    public zdm(int i, boolean z, PutongAct putongAct, int i2, boolean z2, nqh0 nqh0Var, boolean z3) {
        this.f202676c = i;
        this.f202682i = z;
        this.f202677d = putongAct;
        this.f202678e = i2;
        this.f202679f = z2;
        this.f202680g = nqh0Var;
        this.f202681h = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m218176J(View view) {
        oyx.m166735i(this.f202677d, !this.f202682i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m218177K(View view) {
        zvf0.m220399u("e_signup_shoot", this.f202677d.pageId(), vwb.m200311Y("signup_source", CoreModule.m29931H().getSignUpType()));
        CoreModule.m29934N().startInnerCameraForResult(this.f202677d, "from_sign_up", 293);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean z = this.f202679f;
        int size = this.f202683j.f153135a.size();
        return z ? size + 1 : size;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewInflate = this.f202677d.inflater().inflate(f6c0.f95568Sd, viewGroup, false);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.xdm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192422a.m218176J(view);
                }
            });
            return viewInflate;
        }
        PutongAct putongAct = this.f202677d;
        if (i != 2) {
            return putongAct.inflater().inflate(f6c0.f95584Td, viewGroup, false);
        }
        View viewInflate2 = putongAct.inflater().inflate(f6c0.f95944p7, viewGroup, false);
        viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: l.ydm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197574a.m218177K(view);
            }
        });
        return viewInflate2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Media media, int i, int i2) {
        if (i == 1) {
            ((MediaItemView) view).m47778f(media, this.f202678e > 1);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        boolean z = this.f202679f;
        if (z && i == 0) {
            return null;
        }
        List<Media> list = this.f202683j.f153135a;
        if (z) {
            i--;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: L */
    public void m218180L(q860<Media> q860Var) {
        this.f202683j = q860Var;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.f202676c != MediaPickerAct.f30622C || !this.f202683j.m173343c() || i >= this.f202683j.f153135a.size() - 3 || i <= 5) {
            return;
        }
        qib0.f154712a0.m29543y(this.f202680g.f140068c.f114885b, true).subscribe(mkd0.m154956H(roj0.f160389b, new e30() { // from class: l.wdm
            @Override // p149l.e30
            public final void call(Object obj) {
                FacebookApi.m29530m((Throwable) obj);
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f202679f && i == 0) {
            return this.f202681h ? 2 : 0;
        }
        return 1;
    }
}
