package com.p000p1.mobile.putong.live.livingroom.common.debugdialog;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;
import l.d1q;
import l.e5j0;
import l.w4j0;
import p002l.g5c0;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TraceFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    public Activity f5014A;

    /* JADX INFO: renamed from: z */
    public RecyclerView f5015z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.debugdialog.TraceFragment$a */
    public class C0339a extends LiveBaseAdapter {
        public C0339a() {
        }

        /* JADX INFO: renamed from: e0 */
        private List<d1q<?>> m6315e0(List<w4j0> list) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(TraceFragment.this.new C0340b(list.get(i)));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: f0 */
        public void m6316f0(List<w4j0> list) {
            a0(m6315e0(list), false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.debugdialog.TraceFragment$b */
    public class C0340b extends d1q<TracetItemView> {

        /* JADX INFO: renamed from: a */
        public w4j0 f5017a;

        public C0340b(w4j0 w4j0Var) {
            this.f5017a = w4j0Var;
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void m6319u(TracetItemView tracetItemView) {
            super.u(tracetItemView);
            tracetItemView.m6324b(this.f5017a);
        }

        /* JADX INFO: renamed from: o */
        public int m6318o() {
            return t6c0.f19826e6;
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m6314V3(View view) {
        this.f5015z = view.findViewById(g5c0.f10991W4);
        this.f5015z.setLayoutManager(new LinearLayoutManager(this.f5014A));
        C0339a c0339a = new C0339a();
        ArrayList arrayListK = e5j0.INSTANCE.k();
        this.f5015z.setAdapter(c0339a);
        c0339a.m6316f0(arrayListK);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.f5014A = (Activity) context;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(t6c0.f19813d6, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m6314V3(view);
    }
}
