package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaItemView;
import com.p051p1.mobile.putong.core.p058ui.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.data.Media;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class pgm extends jic0<Media> {

    /* JADX INFO: renamed from: c */
    public int f152308c;

    /* JADX INFO: renamed from: d */
    public PutongAct f152309d;

    /* JADX INFO: renamed from: e */
    public int f152310e;

    /* JADX INFO: renamed from: f */
    public boolean f152311f;

    /* JADX INFO: renamed from: g */
    public uyh0 f152312g;

    /* JADX INFO: renamed from: h */
    public boolean f152313h;

    /* JADX INFO: renamed from: i */
    public boolean f152314i;

    /* JADX INFO: renamed from: j */
    public vg60<Media> f152315j = vg60.m201219a();

    public pgm(int i, boolean z, PutongAct putongAct, int i2, boolean z2, uyh0 uyh0Var, boolean z3) {
        this.f152308c = i;
        this.f152314i = z;
        this.f152309d = putongAct;
        this.f152310e = i2;
        this.f152311f = z2;
        this.f152312g = uyh0Var;
        this.f152313h = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m172265J(View view) {
        l7y.m153157i(this.f152309d, !this.f152314i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m172266K(View view) {
        i4g0.m138523u("e_signup_shoot", this.f152309d.pageId(), jyb.m147494Y("signup_source", CoreModule.m30929H().getSignUpType()));
        CoreModule.m30932N().startInnerCameraForResult(this.f152309d, "from_sign_up", 293);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        boolean z = this.f152311f;
        int size = this.f152315j.f184001a.size();
        return z ? size + 1 : size;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewInflate = this.f152309d.inflater().inflate(kec0.f125734Zd, viewGroup, false);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l.ngm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141839a.m172265J(view);
                }
            });
            return viewInflate;
        }
        PutongAct putongAct = this.f152309d;
        if (i != 2) {
            return putongAct.inflater().inflate(kec0.f125751ae, viewGroup, false);
        }
        View viewInflate2 = putongAct.inflater().inflate(kec0.f126117w7, viewGroup, false);
        viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: l.ogm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147294a.m172266K(view);
            }
        });
        return viewInflate2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Media media, int i, int i2) {
        if (i == 1) {
            ((MediaItemView) view).m48961f(media, this.f152310e > 1);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Media getItem(int i) {
        boolean z = this.f152311f;
        if (z && i == 0) {
            return null;
        }
        List<Media> list = this.f152315j.f184001a;
        if (z) {
            i--;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: L */
    public void m172269L(vg60<Media> vg60Var) {
        this.f152315j = vg60Var;
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.f152308c != MediaPickerAct.f31470C || !this.f152315j.m201221c() || i >= this.f152315j.f184001a.size() - 3 || i <= 5) {
            return;
        }
        uqb0.f180395a0.m30541y(this.f152312g.f181619c.f96162b, true).subscribe(psd0.m173597H(uxj0.f181468b, new y20() { // from class: l.mgm
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
        if (this.f152311f && i == 0) {
            return this.f152313h ? 2 : 0;
        }
        return 1;
    }
}
