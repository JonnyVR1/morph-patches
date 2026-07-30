package com.p051p1.mobile.putong.live.livingroom.common.debugdialog;

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
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;
import p153l.aej0;
import p153l.d3q;
import p153l.iej0;
import p153l.mdc0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class TraceFragment extends Fragment {

    /* JADX INFO: renamed from: A */
    public Activity f49820A;

    /* JADX INFO: renamed from: z */
    public RecyclerView f49821z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.debugdialog.TraceFragment$a */
    public class C12913a extends LiveBaseAdapter {
        public C12913a() {
        }

        /* JADX INFO: renamed from: e0 */
        private List<d3q<?>> m73989e0(List<aej0> list) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(TraceFragment.this.new C12914b(list.get(i)));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: f0 */
        public void m73990f0(List<aej0> list) {
            m68555a0(m73989e0(list), false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.debugdialog.TraceFragment$b */
    public class C12914b extends d3q<TracetItemView> {

        /* JADX INFO: renamed from: a */
        public aej0 f49823a;

        public C12914b(aej0 aej0Var) {
            this.f49823a = aej0Var;
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo71749u(TracetItemView tracetItemView) {
            super.mo71749u(tracetItemView);
            tracetItemView.m73996b(this.f49823a);
        }

        @Override // p153l.d3q
        /* JADX INFO: renamed from: o */
        public int mo71748o() {
            return yec0.f199062e6;
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m73988V3(View view) {
        this.f49821z = (RecyclerView) view.findViewById(mdc0.f136086W4);
        this.f49821z.setLayoutManager(new LinearLayoutManager(this.f49820A));
        C12913a c12913a = new C12913a();
        ArrayList<aej0> arrayListM139627k = iej0.INSTANCE.m139627k();
        this.f49821z.setAdapter(c12913a);
        c12913a.m73990f0(arrayListM139627k);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f49820A = (Activity) context;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(yec0.f199049d6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m73988V3(view);
    }
}
