package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.AiAlbumTemplateData;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumTemplatesItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class pg0 extends jic0<AiAlbumTemplateData> {

    /* JADX INFO: renamed from: c */
    public List<AiAlbumTemplateData> f152218c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC19362a f152219d;

    /* JADX INFO: renamed from: e */
    public String f152220e;

    /* JADX INFO: renamed from: l.pg0$a */
    public interface InterfaceC19362a {
        /* JADX INFO: renamed from: a */
        void mo172176a(AiAlbumTemplateData aiAlbumTemplateData, int i);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f152218c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f126160z, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final AiAlbumTemplateData aiAlbumTemplateData, int i, final int i2) {
        if (i == 1) {
            ((AiAlbumTemplatesItemView) view).m45481z(aiAlbumTemplateData, this.f152220e);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.og0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f147176a.m172172H(aiAlbumTemplateData, i2, view2);
                }
            });
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public AiAlbumTemplateData getItem(int i) {
        if (jyb.m147479J(this.f152218c)) {
            return null;
        }
        return this.f152218c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m172172H(AiAlbumTemplateData aiAlbumTemplateData, int i, View view) {
        if (NullChecker.m82486a(this.f152219d)) {
            this.f152219d.mo172176a(aiAlbumTemplateData, i);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m172173I(InterfaceC19362a interfaceC19362a) {
        this.f152219d = interfaceC19362a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: J */
    public void m172174J(List<AiAlbumTemplateData> list) {
        this.f152218c.clear();
        this.f152218c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m172175K(String str) {
        this.f152220e = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }
}
