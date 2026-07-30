package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;

/* JADX INFO: loaded from: classes5.dex */
public class yep extends LiveMenuDialogHolder<tep> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f199388k;

    /* JADX INFO: renamed from: l */
    public View f199389l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f199390m;

    /* JADX INFO: renamed from: n */
    public tep f199391n;

    public yep(Act act, @NonNull tep tepVar) {
        super(yec0.f198718C2, act, tepVar, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m215435F(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m215437J(View view) {
        mo73021p();
    }

    /* JADX INFO: renamed from: K */
    private void m215438K(int[] iArr, boolean z, int i, int i2) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        boolean z2 = i == 80;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f199390m.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.bottomMargin = 0;
        if (z) {
            layoutParams.height = -1;
        } else {
            layoutParams.height = i4;
        }
        layoutParams.width = i3;
        layoutParams.gravity = i;
        this.f199390m.setLayoutParams(layoutParams);
        int iM175859d = qa00.m175859d(i2);
        if (z) {
            return;
        }
        FrameLayout frameLayout = this.f199390m;
        if (z2) {
            qnp0.m177260c1(frameLayout, 0, 0, 0, -iM175859d, iM175859d);
        } else {
            qnp0.m177261d1(frameLayout, iM175859d);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((tep) this.f48605b).act();
    }

    /* JADX INFO: renamed from: H */
    public final void m215439H(View view) {
        zep.m219502a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tep tepVar) {
        this.f199391n = tepVar;
    }

    /* JADX INFO: renamed from: L */
    public void m215441L(mkj mkjVar) {
        m73017E();
        m215438K(mkjVar.m158795d(), mkjVar.m158796e(), mkjVar.m158793b(), mkjVar.m158792a());
        this.f199388k.setBackgroundColor(0);
        this.f199390m.setBackgroundResource(obc0.f146513u7);
        DialogC12774a dialogC12774a = this.f48606c;
        if (dialogC12774a != null) {
            dialogC12774a.getWindow().setSoftInputMode(19);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m215439H(view);
        bnl0.m105509E0(this.f199389l, new View.OnClickListener() { // from class: l.wep
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f188717a.m215437J(view2);
            }
        });
        bnl0.m105509E0(this.f199390m, new View.OnClickListener() { // from class: l.xep
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                yep.m215435F(view2);
            }
        });
    }
}
