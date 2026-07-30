package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.aialbum.view.AiAlbumResultItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class mg0 extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public List<String> f133634c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC18453a f133635d;

    /* JADX INFO: renamed from: e */
    public String f133636e;

    /* JADX INFO: renamed from: l.mg0$a */
    public interface InterfaceC18453a {
        /* JADX INFO: renamed from: a */
        void mo44294a(String str, int i);

        /* JADX INFO: renamed from: b */
        void mo44295b(String str, int i);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f133634c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96089y, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final String str, int i, final int i2) {
        if (i == 1) {
            AiAlbumResultItemView aiAlbumResultItemView = (AiAlbumResultItemView) view;
            aiAlbumResultItemView.m44280z(str, TextUtils.equals(this.f133636e, str));
            xdl0.m208329E0(aiAlbumResultItemView.f28412e, new View.OnClickListener() { // from class: l.kg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f122989a.m154474I(str, i2, view2);
                }
            });
            xdl0.m208329E0(aiAlbumResultItemView.f28413f, new View.OnClickListener() { // from class: l.lg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f127939a.m154475J(str, i2, view2);
                }
            });
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        if (vwb.m200296J(this.f133634c)) {
            return null;
        }
        return this.f133634c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m154474I(String str, int i, View view) {
        if (NullChecker.m81303a(this.f133635d)) {
            this.f133635d.mo44294a(str, i);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m154475J(String str, int i, View view) {
        if (NullChecker.m81303a(this.f133635d)) {
            this.f133635d.mo44295b(str, i);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m154476K(InterfaceC18453a interfaceC18453a) {
        this.f133635d = interfaceC18453a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: L */
    public void m154477L(List<String> list) {
        this.f133634c.clear();
        this.f133634c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public void m154478M(String str) {
        this.f133636e = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }
}
