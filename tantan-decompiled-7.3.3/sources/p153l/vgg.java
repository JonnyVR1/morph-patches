package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vgg extends LiveMenuDialogHolder<ahg> {

    /* JADX INFO: renamed from: k */
    public VText f184027k;

    /* JADX INFO: renamed from: l */
    public VText f184028l;

    /* JADX INFO: renamed from: m */
    public VLinear f184029m;

    /* JADX INFO: renamed from: n */
    public VImage f184030n;

    /* JADX INFO: renamed from: o */
    public VText f184031o;

    /* JADX INFO: renamed from: p */
    @SuppressLint({"SV_USE_DUP_ID"})
    public jxd0 f184032p;

    public vgg(Act act, @NonNull @NotNull ahg ahgVar) {
        super(yec0.f199277v0, act, ahgVar, qag0.m175926g());
        this.f184032p = new jxd0("live_fans_invitation" + uqb0.f180396b0.f170324a.userId(), Boolean.FALSE);
        m73015B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m201225J(View view) {
        boolean zIsSelected = this.f184030n.isSelected();
        VImage vImage = this.f184030n;
        if (zIsSelected) {
            vImage.setSelected(false);
        } else {
            vImage.setSelected(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m201226K(View view) {
        this.f184032p.put(Boolean.valueOf(this.f184030n.isSelected()));
        T t = this.f48605b;
        if (t != 0) {
            ((ahg) t).m97833V3();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((ahg) this.f48605b).act();
    }

    /* JADX INFO: renamed from: H */
    public final void m201227H(View view) {
        wgg.m206194a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public void m201229L(String str) {
        this.f184027k.setText(str);
        bnl0.m105509E0(this.f184029m, new View.OnClickListener() { // from class: l.tgg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174080a.m201225J(view);
            }
        });
        bnl0.m105509E0(this.f184031o, new View.OnClickListener() { // from class: l.ugg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178891a.m201226K(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m201227H(view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ahg ahgVar) {
    }
}
