package p006l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.aialbum.view.AiAlbumTemplatesItemView;
import com.p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tg0 extends dac0<AiAlbumTemplateData> {

    /* JADX INFO: renamed from: c */
    public List<AiAlbumTemplateData> f22088c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC1308a f22089d;

    /* JADX INFO: renamed from: e */
    public String f22090e;

    /* JADX INFO: renamed from: l.tg0$a */
    public interface InterfaceC1308a {
        /* JADX INFO: renamed from: a */
        void mo24688a(AiAlbumTemplateData aiAlbumTemplateData, int i);
    }

    /* JADX INFO: renamed from: C */
    public int m24680C() {
        return this.f22088c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m24681D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f12519z, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m24679A(View view, final AiAlbumTemplateData aiAlbumTemplateData, int i, final int i2) {
        if (i == 1) {
            ((AiAlbumTemplatesItemView) view).m7254z(aiAlbumTemplateData, this.f22090e);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.sg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f21292a.m24684H(aiAlbumTemplateData, i2, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public AiAlbumTemplateData getItem(int i) {
        if (vwb.J(this.f22088c)) {
            return null;
        }
        return this.f22088c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m24684H(AiAlbumTemplateData aiAlbumTemplateData, int i, View view) {
        if (NullChecker.a(this.f22089d)) {
            this.f22089d.mo24688a(aiAlbumTemplateData, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m24685I(InterfaceC1308a interfaceC1308a) {
        this.f22089d = interfaceC1308a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: J */
    public void m24686J(List<AiAlbumTemplateData> list) {
        this.f22088c.clear();
        this.f22088c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m24687K(String str) {
        this.f22090e = str;
    }

    public int getItemViewType(int i) {
        return 1;
    }
}
