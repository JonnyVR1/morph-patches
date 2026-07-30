package com.clevertap.android.sdk.inbox;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import p153l.efc0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.f */
/* JADX INFO: loaded from: classes.dex */
class C1310f extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a */
    private CTInboxListViewFragment f5393a;

    /* JADX INFO: renamed from: b */
    private ArrayList<CTInboxMessage> f5394b;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.f$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5395a;

        static {
            int[] iArr = new int[CTInboxMessageType.values().length];
            f5395a = iArr;
            try {
                iArr[CTInboxMessageType.SimpleMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5395a[CTInboxMessageType.IconMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5395a[CTInboxMessageType.CarouselMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5395a[CTInboxMessageType.CarouselImageMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C1310f(ArrayList<CTInboxMessage> arrayList, CTInboxListViewFragment cTInboxListViewFragment) {
        Logger.m5927v("CTInboxMessageAdapter: messages=" + arrayList);
        this.f5394b = arrayList;
        this.f5393a = cTInboxListViewFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5394b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int i2 = a.f5395a[this.f5394b.get(i).m6740h().ordinal()];
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
    public void onBindViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        ((C1308d) abstractC0569e0).mo6788f(this.f5394b.get(i), this.f5393a, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public C1308d onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C1311g(LayoutInflater.from(viewGroup.getContext()).inflate(efc0.f93763t, viewGroup, false));
        }
        if (i == 1) {
            return new C1307c(LayoutInflater.from(viewGroup.getContext()).inflate(efc0.f93761r, viewGroup, false));
        }
        if (i == 2) {
            return new C1306b(LayoutInflater.from(viewGroup.getContext()).inflate(efc0.f93760q, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new C1305a(LayoutInflater.from(viewGroup.getContext()).inflate(efc0.f93759p, viewGroup, false));
    }
}
