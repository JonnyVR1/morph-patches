package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.VoiceIntlSettingLayout;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class fon0 implements iam<won0> {

    /* JADX INFO: renamed from: a */
    public VoiceIntlSettingLayout f100075a;

    /* JADX INFO: renamed from: b */
    public DialogC12774a f100076b;

    /* JADX INFO: renamed from: c */
    public won0 f100077c;

    /* JADX INFO: renamed from: d */
    public Map<String, List<ic3<?>>> f100078d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m126482f(View view) {
        VoiceIntlSettingLayout voiceIntlSettingLayout = (VoiceIntlSettingLayout) view;
        this.f100075a = voiceIntlSettingLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m126483i(DialogInterface dialogInterface) {
        VoiceIntlSettingLayout voiceIntlSettingLayout;
        Map<String, List<ic3<?>>> map = this.f100078d;
        if (map == null || (voiceIntlSettingLayout = this.f100075a) == null) {
            return;
        }
        voiceIntlSettingLayout.m78967h(map, this.f100077c.f190053j.f183196d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m126484j(DialogInterface dialogInterface) {
        this.f100077c.m207327j4();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f100077c.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(won0 won0Var) {
        this.f100077c = won0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m126486e() {
        DialogC12774a dialogC12774a = this.f100076b;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f100076b.dismiss();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m126487k(Map<String, List<ic3<?>>> map) {
        this.f100078d = map;
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: l */
    public void m126488l() {
        if (this.f100076b == null) {
            c0s c0sVar = new c0s(this.f100077c, yec0.f199130j9);
            this.f100076b = c0sVar;
            c0sVar.m72959h0(new y20() { // from class: l.con0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f82901a.m126482f((View) obj);
                }
            });
            this.f100076b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.don0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f89978a.m126483i(dialogInterface);
                }
            });
            this.f100076b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.eon0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f94939a.m126484j(dialogInterface);
                }
            });
        }
        this.f100076b.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
