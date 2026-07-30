package com.clevertap.android.sdk.inbox;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import p149l.a7c0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.f */
/* JADX INFO: loaded from: classes.dex */
class C1287f extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private CTInboxListViewFragment f5356a;

    /* JADX INFO: renamed from: b */
    private ArrayList<CTInboxMessage> f5357b;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5358a;

        static {
            int[] iArr = new int[CTInboxMessageType.values().length];
            f5358a = iArr;
            try {
                iArr[CTInboxMessageType.SimpleMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5358a[CTInboxMessageType.IconMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5358a[CTInboxMessageType.CarouselMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5358a[CTInboxMessageType.CarouselImageMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C1287f(ArrayList<CTInboxMessage> arrayList, CTInboxListViewFragment cTInboxListViewFragment) {
        Logger.m5873v("CTInboxMessageAdapter: messages=" + arrayList);
        this.f5357b = arrayList;
        this.f5356a = cTInboxListViewFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5357b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = a.f5358a[this.f5357b.get(i).m6686h().ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 != 3) {
            return i2 != 4 ? -1 : 3;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        ((C1285d) abstractC0566d0).mo6734f(this.f5357b.get(i), this.f5356a, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C1285d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C1288g(LayoutInflater.from(viewGroup.getContext()).inflate(a7c0.f67911t, viewGroup, false));
        }
        if (i == 1) {
            return new C1284c(LayoutInflater.from(viewGroup.getContext()).inflate(a7c0.f67909r, viewGroup, false));
        }
        if (i == 2) {
            return new C1283b(LayoutInflater.from(viewGroup.getContext()).inflate(a7c0.f67908q, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new C1282a(LayoutInflater.from(viewGroup.getContext()).inflate(a7c0.f67907p, viewGroup, false));
    }
}
