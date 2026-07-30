package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.apmem.tools.layouts.FlowLayout;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c3h<T> extends AbstractC15503a<T> {

    /* JADX INFO: renamed from: c */
    public List<T> f78945c;

    /* JADX INFO: renamed from: d */
    public FlowLayout f78946d;

    /* JADX INFO: renamed from: e */
    public InterfaceC16050a<T> f78947e;

    /* JADX INFO: renamed from: l.c3h$a */
    public interface InterfaceC16050a<T> {
        /* JADX INFO: renamed from: a */
        void mo105026a(View view, T t, int i);
    }

    public c3h(@NonNull List<T> list) {
        this.f78945c = list;
    }

    /* JADX INFO: renamed from: A */
    public void m105021A(InterfaceC16050a<T> interfaceC16050a) {
        this.f78947e = interfaceC16050a;
    }

    @Override // p149l.AbstractC15503a, android.widget.Adapter
    public T getItem(int i) {
        if (vwb.m200296J(this.f78945c)) {
            return null;
        }
        return this.f78945c.get(i);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m105024y();
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<T> mo20404p() {
        return this.f78945c;
    }

    /* JADX INFO: renamed from: t */
    public void m105022t(FlowLayout flowLayout) {
        this.f78946d = flowLayout;
        m105024y();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m105023w(View view, Object obj, int i, View view2) {
        AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
        if (!NullChecker.m81303a(audioBusinessTypeMo135235c)) {
            if (NullChecker.m81303a(this.f78947e)) {
                this.f78947e.mo105026a(view, obj, i);
            }
        } else if (audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.m151593w(R$string.f38870B2);
        } else {
            osi0.m165783g(audioBusinessTypeMo135235c.getBusinessMsg());
        }
    }

    /* JADX INFO: renamed from: y */
    public void m105024y() {
        FlowLayout flowLayout;
        if (vwb.m200296J(this.f78945c) || (flowLayout = this.f78946d) == null) {
            return;
        }
        flowLayout.removeAllViews();
        for (final int i = 0; i < this.f78945c.size(); i++) {
            int itemViewType = getItemViewType(i);
            final T item = getItem(i);
            final View viewMo20403m = mo20403m(this.f78946d, itemViewType);
            viewMo20403m.setOnClickListener(new View.OnClickListener() { // from class: l.b3h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f73217a.m105023w(viewMo20403m, item, i, view);
                }
            });
            mo20402j(viewMo20403m, item, itemViewType, i);
            this.f78946d.addView(viewMo20403m);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m105025z(List<T> list) {
        this.f78945c = list;
        notifyDataSetChanged();
    }
}
