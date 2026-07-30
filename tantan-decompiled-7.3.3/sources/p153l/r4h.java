package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;

/* JADX INFO: loaded from: classes13.dex */
public abstract class r4h<T> extends AbstractC15610a<T> {

    /* JADX INFO: renamed from: c */
    public List<T> f161204c;

    /* JADX INFO: renamed from: d */
    public FlowLayout f161205d;

    /* JADX INFO: renamed from: e */
    public InterfaceC19760a<T> f161206e;

    /* JADX INFO: renamed from: l.r4h$a */
    public interface InterfaceC19760a<T> {
        /* JADX INFO: renamed from: a */
        void mo96595a(View view, T t, int i);
    }

    public r4h(@NonNull List<T> list) {
        this.f161204c = list;
    }

    /* JADX INFO: renamed from: A */
    public void m179762A(InterfaceC19760a<T> interfaceC19760a) {
        this.f161206e = interfaceC19760a;
    }

    @Override // p153l.AbstractC15610a, android.widget.Adapter
    public T getItem(int i) {
        if (jyb.m147479J(this.f161204c)) {
            return null;
        }
        return this.f161204c.get(i);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m179765y();
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<T> mo21403p() {
        return this.f161204c;
    }

    /* JADX INFO: renamed from: t */
    public void m179763t(FlowLayout flowLayout) {
        this.f161205d = flowLayout;
        m179765y();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m179764w(View view, Object obj, int i, View view2) {
        AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
        if (!NullChecker.m82486a(audioBusinessTypeMo171474c)) {
            if (NullChecker.m82486a(this.f161206e)) {
                this.f161206e.mo96595a(view, obj, i);
            }
        } else if (audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            o1j0.m165649w(R$string.f39718B2);
        } else {
            r1j0.m179420g(audioBusinessTypeMo171474c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m179765y() {
        FlowLayout flowLayout;
        if (jyb.m147479J(this.f161204c) || (flowLayout = this.f161205d) == null) {
            return;
        }
        flowLayout.removeAllViews();
        for (final int i = 0; i < this.f161204c.size(); i++) {
            int itemViewType = getItemViewType(i);
            final T item = getItem(i);
            final View viewMo21402m = mo21402m(this.f161205d, itemViewType);
            viewMo21402m.setOnClickListener(new View.OnClickListener() { // from class: l.q4h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f155591a.m179764w(viewMo21402m, item, i, view);
                }
            });
            mo21401j(viewMo21402m, item, itemViewType, i);
            this.f161205d.addView(viewMo21402m);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m179766z(List<T> list) {
        this.f161204c = list;
        notifyDataSetChanged();
    }
}
