package com.p046p1.mobile.putong.live.livingroom.common.debugdialog;

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
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;
import p149l.d1q;
import p149l.e5j0;
import p149l.g5c0;
import p149l.t6c0;
import p149l.w4j0;

/* JADX INFO: loaded from: classes4.dex */
public class TraceFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    public Activity f48972A;

    /* JADX INFO: renamed from: z */
    public RecyclerView f48973z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.debugdialog.TraceFragment$a */
    public class C12750a extends LiveBaseAdapter {
        public C12750a() {
        }

        /* JADX INFO: renamed from: e0 */
        private List<d1q<?>> m72806e0(List<w4j0> list) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(TraceFragment.this.new C12751b(list.get(i)));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: f0 */
        public void m72807f0(List<w4j0> list) {
            m67372a0(m72806e0(list), false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.debugdialog.TraceFragment$b */
    public class C12751b extends d1q<TracetItemView> {

        /* JADX INFO: renamed from: a */
        public w4j0 f48975a;

        public C12751b(w4j0 w4j0Var) {
            this.f48975a = w4j0Var;
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo70566u(TracetItemView tracetItemView) {
            super.mo70566u(tracetItemView);
            tracetItemView.m72813b(this.f48975a);
        }

        @Override // p149l.d1q
        /* JADX INFO: renamed from: o */
        public int mo70565o() {
            return t6c0.f168330e6;
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m72805V3(View view) {
        this.f48973z = (RecyclerView) view.findViewById(g5c0.f100841W4);
        this.f48973z.setLayoutManager(new LinearLayoutManager(this.f48972A));
        C12750a c12750a = new C12750a();
        ArrayList<w4j0> arrayListM114823k = e5j0.INSTANCE.m114823k();
        this.f48973z.setAdapter(c12750a);
        c12750a.m72807f0(arrayListM114823k);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f48972A = (Activity) context;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(t6c0.f168317d6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m72805V3(view);
    }
}
