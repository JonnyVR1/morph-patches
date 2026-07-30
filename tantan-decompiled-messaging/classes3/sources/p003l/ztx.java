package p003l;

import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.jq2;
import l.mcr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ztx extends jq2<eux> {

    /* JADX INFO: renamed from: c */
    public static ArrayList<Media> f9424c;

    /* JADX INFO: renamed from: a */
    public int f9425a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Media> f9426b;

    public ztx(mcr mcrVar) {
        super(mcrVar);
        this.f9425a = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m9466h0(Bundle bundle) {
        ((eux) ((jq2) this).viewModel).init();
    }

    /* JADX INFO: renamed from: a0 */
    public void m9467a0() {
        creates(new e30() { // from class: l.ytx
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9141a.m9466h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public int m9468f0() {
        return this.f9425a;
    }

    /* JADX INFO: renamed from: g0 */
    public ArrayList<Media> m9469g0() {
        return this.f9426b;
    }

    /* JADX INFO: renamed from: i0 */
    public void m9470i0() {
        if (NullChecker.a(this.f9426b)) {
            Intent intent = new Intent();
            intent.putExtra("selectedImages", this.f9426b);
            intent.putExtra("isDone", false);
            act().setResult(-1, intent);
        } else {
            act().setResult(0);
        }
        act().finish();
    }

    /* JADX INFO: renamed from: j0 */
    public void m9471j0(ArrayList<Media> arrayList, int i) {
        this.f9426b = arrayList;
        this.f9425a = i;
        if (f9424c == null) {
            f9424c = new ArrayList<>();
            act().finish();
        }
        ArrayList<Media> arrayList2 = new ArrayList<>();
        arrayList2.addAll(f9424c);
        f9424c = null;
        ((eux) ((jq2) this).viewModel).m3936k(arrayList2);
    }

    public void destroy() {
    }
}
