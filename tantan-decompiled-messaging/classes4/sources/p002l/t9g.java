package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class t9g implements s7m<y9g> {

    /* JADX INFO: renamed from: a */
    public y9g f20139a;

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22819C0() {
        y9g y9gVar = this.f20139a;
        if (y9gVar == null) {
            return null;
        }
        return y9gVar.act();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m22821i1(y9g y9gVar) {
        this.f20139a = y9gVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
