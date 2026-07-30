package p006l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.aialbum.view.AiAlbumResultItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mg0 extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public List<String> f16962c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC1010a f16963d;

    /* JADX INFO: renamed from: e */
    public String f16964e;

    /* JADX INFO: renamed from: l.mg0$a */
    public interface InterfaceC1010a {
        /* JADX INFO: renamed from: a */
        void mo7250a(String str, int i);

        /* JADX INFO: renamed from: b */
        void mo7251b(String str, int i);
    }

    /* JADX INFO: renamed from: C */
    public int m19252C() {
        return this.f16962c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m19253D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f12503y, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m19251A(View view, final String str, int i, final int i2) {
        if (i == 1) {
            AiAlbumResultItemView aiAlbumResultItemView = (AiAlbumResultItemView) view;
            aiAlbumResultItemView.m7236z(str, TextUtils.equals(this.f16964e, str));
            xdl0.E0(aiAlbumResultItemView.f4479e, new View.OnClickListener() { // from class: l.kg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f15807a.m19256I(str, i2, view2);
                }
            });
            xdl0.E0(aiAlbumResultItemView.f4480f, new View.OnClickListener() { // from class: l.lg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f16405a.m19257J(str, i2, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        if (vwb.J(this.f16962c)) {
            return null;
        }
        return this.f16962c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m19256I(String str, int i, View view) {
        if (NullChecker.a(this.f16963d)) {
            this.f16963d.mo7250a(str, i);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m19257J(String str, int i, View view) {
        if (NullChecker.a(this.f16963d)) {
            this.f16963d.mo7251b(str, i);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m19258K(InterfaceC1010a interfaceC1010a) {
        this.f16963d = interfaceC1010a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: L */
    public void m19259L(List<String> list) {
        this.f16962c.clear();
        this.f16962c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public void m19260M(String str) {
        this.f16964e = str;
    }

    public int getItemViewType(int i) {
        return 1;
    }
}
