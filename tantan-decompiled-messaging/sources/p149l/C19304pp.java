package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountMediaItemView;
import com.p046p1.mobile.putong.account.p050ui.mediapicker.impl.AccountMediaPickerAct;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import java.util.List;

/* JADX INFO: renamed from: l.pp */
/* JADX INFO: loaded from: classes9.dex */
public class C19304pp extends dac0<Media> {

    /* JADX INFO: renamed from: c */
    public int f150577c;

    /* JADX INFO: renamed from: d */
    public PutongAct f150578d;

    /* JADX INFO: renamed from: e */
    public int f150579e;

    /* JADX INFO: renamed from: f */
    public boolean f150580f;

    /* JADX INFO: renamed from: g */
    public nqh0 f150581g;

    /* JADX INFO: renamed from: h */
    public boolean f150582h;

    /* JADX INFO: renamed from: i */
    public String f150583i;

    /* JADX INFO: renamed from: j */
    public boolean f150584j;

    /* JADX INFO: renamed from: k */
    public q860<Media> f150585k = q860.m173341a();

    public C19304pp(int i, boolean z, PutongAct putongAct, int i2, boolean z2, nqh0 nqh0Var, boolean z3, String str) {
        this.f150577c = i;
        this.f150584j = z;
        this.f150578d = putongAct;
        this.f150579e = i2;
        this.f150580f = z2;
        this.f150581g = nqh0Var;
        this.f150582h = z3;
        this.f150583i = str;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean z = this.f150580f;
        int size = this.f150585k.f153135a.size();
        return z ? size + 1 : size;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewInflate = this.f150578d.inflater().inflate(c6c0.f79466F, viewGroup, false);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.mp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134965a.m170650J(view);
                }
            });
            return viewInflate;
        }
        PutongAct putongAct = this.f150578d;
        if (i != 2) {
            return putongAct.inflater().inflate(c6c0.f79467G, viewGroup, false);
        }
        View viewInflate2 = putongAct.inflater().inflate(c6c0.f79463C, viewGroup, false);
        viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: l.np
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139899a.m170651K(view);
            }
        });
        return viewInflate2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Media media, int i, int i2) {
        if (i == 1) {
            ((AccountMediaItemView) view).m29177f(media, this.f150579e > 1);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        boolean z = this.f150580f;
        if (z && i == 0) {
            return null;
        }
        List<Media> list = this.f150585k.f153135a;
        if (z) {
            i--;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m170650J(View view) {
        oyx.m166735i(this.f150578d, !this.f150584j);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m170651K(View view) {
        if (TextUtils.equals(this.f150583i, "from_fake_alert")) {
            zvf0.m220396r("e_picture_shoot", "p_picture_selection_view");
        } else {
            zvf0.m220399u("e_signup_shoot", this.f150578d.pageId(), vwb.m200311Y("signup_source", AccountModule.m28131F().getSignUpType()));
        }
        AccountModule.m28133J().startInnerCameraForResult(this.f150578d, "from_sign_up", 293);
    }

    /* JADX INFO: renamed from: L */
    public void m170652L(q860<Media> q860Var) {
        this.f150585k = q860Var;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.f150577c != AccountMediaPickerAct.f17012B || !this.f150585k.m173343c() || i >= this.f150585k.f153135a.size() - 3 || i <= 5) {
            return;
        }
        qib0.f154712a0.m29543y(this.f150581g.f140068c.f114885b, true).subscribe(mkd0.m154956H(roj0.f160389b, new e30() { // from class: l.op
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
        if (this.f150580f && i == 0) {
            return this.f150582h ? 2 : 0;
        }
        return 1;
    }
}
