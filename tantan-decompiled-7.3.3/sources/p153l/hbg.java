package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class hbg implements iam<mbg> {

    /* JADX INFO: renamed from: a */
    public mbg f108588a;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        mbg mbgVar = this.f108588a;
        if (mbgVar == null) {
            return null;
        }
        return mbgVar.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(mbg mbgVar) {
        this.f108588a = mbgVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
