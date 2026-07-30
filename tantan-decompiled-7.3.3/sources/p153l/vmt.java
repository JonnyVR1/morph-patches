package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Objects;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class vmt implements iam<tmt> {

    /* JADX INFO: renamed from: a */
    public qmt f184754a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f184755b;

    /* JADX INFO: renamed from: c */
    public final VRecyclerView f184756c;

    /* JADX INFO: renamed from: d */
    public tmt f184757d;

    public vmt(LinearLayout linearLayout, VRecyclerView vRecyclerView) {
        this.f184755b = linearLayout;
        this.f184756c = vRecyclerView;
        int i = qa00.f156321h;
        vRecyclerView.addItemDecoration(new guf0(i, i));
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tmt tmtVar) {
        this.f184757d = tmtVar;
    }

    /* JADX INFO: renamed from: b */
    public void m201771b(List<mr2> list) {
        bnl0.m105524M(this.f184755b, true);
        qmt qmtVar = this.f184754a;
        if (qmtVar != null) {
            qmtVar.m177146I(list);
            return;
        }
        final tmt tmtVar = this.f184757d;
        Objects.requireNonNull(tmtVar);
        qmt qmtVar2 = new qmt(list, new y20() { // from class: l.umt
            @Override // p153l.y20
            public final void call(Object obj) {
                tmtVar.m191810K2((mr2) obj);
            }
        });
        this.f184754a = qmtVar2;
        this.f184756c.setAdapter(qmtVar2);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
