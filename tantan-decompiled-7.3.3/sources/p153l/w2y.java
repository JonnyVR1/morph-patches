package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class w2y extends ar2<b3y> {

    /* JADX INFO: renamed from: c */
    public static ArrayList<Media> f186955c;

    /* JADX INFO: renamed from: a */
    public int f186956a;

    /* JADX INFO: renamed from: b */
    public ArrayList<Media> f186957b;

    public w2y(ner nerVar) {
        super(nerVar);
        this.f186956a = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void m204606h0(Bundle bundle) {
        ((b3y) this.viewModel).init();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.v2y
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182131a.m204606h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public int m204607f0() {
        return this.f186956a;
    }

    /* JADX INFO: renamed from: g0 */
    public ArrayList<Media> m204608g0() {
        return this.f186957b;
    }

    /* JADX INFO: renamed from: i0 */
    public void m204609i0() {
        if (NullChecker.m82486a(this.f186957b)) {
            Intent intent = new Intent();
            intent.putExtra("selectedImages", this.f186957b);
            intent.putExtra("isDone", false);
            act().setResult(-1, intent);
        } else {
            act().setResult(0);
        }
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: j0 */
    public void m204610j0(ArrayList<Media> arrayList, int i) {
        this.f186957b = arrayList;
        this.f186956a = i;
        if (f186955c == null) {
            f186955c = new ArrayList<>();
            act().lambda$debugItems$19();
        }
        ArrayList<Media> arrayList2 = new ArrayList<>();
        arrayList2.addAll(f186955c);
        f186955c = null;
        ((b3y) this.viewModel).m102372k(arrayList2);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
