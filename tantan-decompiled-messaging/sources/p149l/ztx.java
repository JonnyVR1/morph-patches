package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ztx extends jq2<eux> {

    /* JADX INFO: renamed from: c */
    public static ArrayList<Media> f204776c;

    /* JADX INFO: renamed from: a */
    public int f204777a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Media> f204778b;

    public ztx(mcr mcrVar) {
        super(mcrVar);
        this.f204777a = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m220155h0(Bundle bundle) {
        ((eux) this.viewModel).init();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ytx
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200030a.m220155h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public int m220156f0() {
        return this.f204777a;
    }

    /* JADX INFO: renamed from: g0 */
    public ArrayList<Media> m220157g0() {
        return this.f204778b;
    }

    /* JADX INFO: renamed from: i0 */
    public void m220158i0() {
        if (NullChecker.m81303a(this.f204778b)) {
            Intent intent = new Intent();
            intent.putExtra("selectedImages", this.f204778b);
            intent.putExtra("isDone", false);
            act().setResult(-1, intent);
        } else {
            act().setResult(0);
        }
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: j0 */
    public void m220159j0(ArrayList<Media> arrayList, int i) {
        this.f204778b = arrayList;
        this.f204777a = i;
        if (f204776c == null) {
            f204776c = new ArrayList<>();
            act().lambda$debugItems$19();
        }
        ArrayList<Media> arrayList2 = new ArrayList<>();
        arrayList2.addAll(f204776c);
        f204776c = null;
        ((eux) this.viewModel).m118217k(arrayList2);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
