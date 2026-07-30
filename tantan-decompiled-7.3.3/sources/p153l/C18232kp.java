package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountMediaItemView;
import com.p051p1.mobile.putong.account.p055ui.mediapicker.impl.AccountMediaPickerAct;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import java.util.List;

/* JADX INFO: renamed from: l.kp */
/* JADX INFO: loaded from: classes9.dex */
public class C18232kp extends jic0<Media> {

    /* JADX INFO: renamed from: c */
    public int f127811c;

    /* JADX INFO: renamed from: d */
    public PutongAct f127812d;

    /* JADX INFO: renamed from: e */
    public int f127813e;

    /* JADX INFO: renamed from: f */
    public boolean f127814f;

    /* JADX INFO: renamed from: g */
    public uyh0 f127815g;

    /* JADX INFO: renamed from: h */
    public boolean f127816h;

    /* JADX INFO: renamed from: i */
    public String f127817i;

    /* JADX INFO: renamed from: j */
    public boolean f127818j;

    /* JADX INFO: renamed from: k */
    public vg60<Media> f127819k = vg60.m201219a();

    public C18232kp(int i, boolean z, PutongAct putongAct, int i2, boolean z2, uyh0 uyh0Var, boolean z3, String str) {
        this.f127811c = i;
        this.f127818j = z;
        this.f127812d = putongAct;
        this.f127813e = i2;
        this.f127814f = z2;
        this.f127815g = uyh0Var;
        this.f127816h = z3;
        this.f127817i = str;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean z = this.f127814f;
        int size = this.f127819k.f184001a.size();
        return z ? size + 1 : size;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewInflate = this.f127812d.inflater().inflate(hec0.f109078F, viewGroup, false);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.hp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f110971a.m150695J(view);
                }
            });
            return viewInflate;
        }
        PutongAct putongAct = this.f127812d;
        if (i != 2) {
            return putongAct.inflater().inflate(hec0.f109079G, viewGroup, false);
        }
        View viewInflate2 = putongAct.inflater().inflate(hec0.f109075C, viewGroup, false);
        viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: l.ip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116231a.m150696K(view);
            }
        });
        return viewInflate2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Media media, int i, int i2) {
        if (i == 1) {
            ((AccountMediaItemView) view).m30175f(media, this.f127813e > 1);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        boolean z = this.f127814f;
        if (z && i == 0) {
            return null;
        }
        List<Media> list = this.f127819k.f184001a;
        if (z) {
            i--;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m150695J(View view) {
        l7y.m153157i(this.f127812d, !this.f127818j);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m150696K(View view) {
        if (TextUtils.equals(this.f127817i, "from_fake_alert")) {
            i4g0.m138520r("e_picture_shoot", "p_picture_selection_view");
        } else {
            i4g0.m138523u("e_signup_shoot", this.f127812d.pageId(), jyb.m147494Y("signup_source", AccountModule.m29130F().getSignUpType()));
        }
        AccountModule.m29132J().startInnerCameraForResult(this.f127812d, "from_sign_up", 293);
    }

    /* JADX INFO: renamed from: L */
    public void m150697L(vg60<Media> vg60Var) {
        this.f127819k = vg60Var;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.f127811c != AccountMediaPickerAct.f17731B || !this.f127819k.m201221c() || i >= this.f127819k.f184001a.size() - 3 || i <= 5) {
            return;
        }
        uqb0.f180395a0.m30541y(this.f127815g.f181619c.f96162b, true).subscribe(psd0.m173597H(uxj0.f181468b, new y20() { // from class: l.jp
            @Override // p153l.y20
            public final void call(Object obj) {
                FacebookApi.m30528m((Throwable) obj);
            }
        }));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f127814f && i == 0) {
            return this.f127816h ? 2 : 0;
        }
        return 1;
    }
}
