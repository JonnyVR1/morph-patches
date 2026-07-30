package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumTemplatesItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class tg0 extends dac0<AiAlbumTemplateData> {

    /* JADX INFO: renamed from: c */
    public List<AiAlbumTemplateData> f170038c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC20167a f170039d;

    /* JADX INFO: renamed from: e */
    public String f170040e;

    /* JADX INFO: renamed from: l.tg0$a */
    public interface InterfaceC20167a {
        /* JADX INFO: renamed from: a */
        void mo188764a(AiAlbumTemplateData aiAlbumTemplateData, int i);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f170038c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96105z, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final AiAlbumTemplateData aiAlbumTemplateData, int i, final int i2) {
        if (i == 1) {
            ((AiAlbumTemplatesItemView) view).m44298z(aiAlbumTemplateData, this.f170040e);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.sg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f164353a.m188760H(aiAlbumTemplateData, i2, view2);
                }
            });
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public AiAlbumTemplateData getItem(int i) {
        if (vwb.m200296J(this.f170038c)) {
            return null;
        }
        return this.f170038c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m188760H(AiAlbumTemplateData aiAlbumTemplateData, int i, View view) {
        if (NullChecker.m81303a(this.f170039d)) {
            this.f170039d.mo188764a(aiAlbumTemplateData, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m188761I(InterfaceC20167a interfaceC20167a) {
        this.f170039d = interfaceC20167a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: J */
    public void m188762J(List<AiAlbumTemplateData> list) {
        this.f170038c.clear();
        this.f170038c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m188763K(String str) {
        this.f170040e = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }
}
