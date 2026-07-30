package p007l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a;
import l.ib1;
import l.lsi0;
import l.osi0;
import l.vwb;
import org.apmem.tools.layouts.FlowLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class c3h<T> extends a<T> {

    /* JADX INFO: renamed from: c */
    public List<T> f6517c;

    /* JADX INFO: renamed from: d */
    public FlowLayout f6518d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2348a<T> f6519e;

    /* JADX INFO: renamed from: l.c3h$a */
    public interface InterfaceC2348a<T> {
        /* JADX INFO: renamed from: a */
        void mo9091a(View view, T t, int i);
    }

    public c3h(@NonNull List<T> list) {
        this.f6517c = list;
    }

    /* JADX INFO: renamed from: A */
    public void m9085A(InterfaceC2348a<T> interfaceC2348a) {
        this.f6519e = interfaceC2348a;
    }

    public T getItem(int i) {
        if (vwb.J(this.f6517c)) {
            return null;
        }
        return this.f6517c.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void notifyDataSetChanged() {
        super/*android.widget.BaseAdapter*/.notifyDataSetChanged();
        m9089y();
    }

    /* JADX INFO: renamed from: p */
    public List<T> m9086p() {
        return this.f6517c;
    }

    /* JADX INFO: renamed from: t */
    public void m9087t(FlowLayout flowLayout) {
        this.f6518d = flowLayout;
        m9089y();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m9088w(View view, Object obj, int i, View view2) {
        AudioBusinessType audioBusinessTypeC = ib1.b().c();
        if (!NullChecker.a(audioBusinessTypeC)) {
            if (NullChecker.a(this.f6519e)) {
                this.f6519e.mo9091a(view, obj, i);
            }
        } else if (audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW) {
            lsi0.w(R$string.f331B2);
        } else {
            osi0.g(audioBusinessTypeC.getBusinessMsg());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public void m9089y() {
        FlowLayout flowLayout;
        if (vwb.J(this.f6517c) || (flowLayout = this.f6518d) == null) {
            return;
        }
        flowLayout.removeAllViews();
        for (final int i = 0; i < this.f6517c.size(); i++) {
            int itemViewType = getItemViewType(i);
            final Object item = getItem(i);
            final View viewM = m(this.f6518d, itemViewType);
            viewM.setOnClickListener(new View.OnClickListener() { // from class: l.b3h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5904a.m9088w(viewM, item, i, view);
                }
            });
            j(viewM, item, itemViewType, i);
            this.f6518d.addView(viewM);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m9090z(List<T> list) {
        this.f6517c = list;
        notifyDataSetChanged();
    }
}
