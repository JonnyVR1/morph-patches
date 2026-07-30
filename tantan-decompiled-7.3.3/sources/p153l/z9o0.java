package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiDialogLayout;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class z9o0 implements iam<vao0> {

    /* JADX INFO: renamed from: a */
    public VoiceMicEmojiDialogLayout f203501a;

    /* JADX INFO: renamed from: b */
    public DialogC12774a f203502b;

    /* JADX INFO: renamed from: c */
    public vao0 f203503c;

    /* JADX INFO: renamed from: d */
    public List<oln0> f203504d;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f203503c.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vao0 vao0Var) {
        this.f203503c = vao0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m219080d() {
        DialogC12774a dialogC12774a = this.f203502b;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f203502b.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m219081e(View view) {
        this.f203501a = (VoiceMicEmojiDialogLayout) view;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m219082f(DialogInterface dialogInterface) {
        VoiceMicEmojiDialogLayout voiceMicEmojiDialogLayout;
        List<oln0> list = this.f203504d;
        if (list == null || (voiceMicEmojiDialogLayout = this.f203501a) == null) {
            return;
        }
        voiceMicEmojiDialogLayout.m79302b(list);
    }

    /* JADX INFO: renamed from: i */
    public void m219083i(List<oln0> list) {
        this.f203504d = list;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @SuppressLint({"InflateParams"})
    /* JADX INFO: renamed from: j */
    public void m219084j() {
        if (this.f203502b == null) {
            c0s c0sVar = new c0s(this.f203503c, yec0.f198869O9);
            this.f203502b = c0sVar;
            c0sVar.m72959h0(new y20() { // from class: l.x9o0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192952a.m219081e((View) obj);
                }
            });
            this.f203502b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.y9o0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f198113a.m219082f(dialogInterface);
                }
            });
        }
        this.f203502b.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
