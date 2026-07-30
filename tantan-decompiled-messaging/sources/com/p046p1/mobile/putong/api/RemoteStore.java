package com.p046p1.mobile.putong.api;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Links;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p133rx.subjects.C22392a;
import p149l.e51;
import p149l.roj0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class RemoteStore {

    /* JADX INFO: renamed from: a */
    public boolean f17101a = false;

    /* JADX INFO: renamed from: b */
    public C22392a<roj0> f17102b = C22392a.m221512b();

    public class RemoteData<T extends DbObject> extends HashMap<String, T> {
        public Links links;
        public List<T> remoteData = new ArrayList();
        private LinkedHashMap<String, T> localData = new LinkedHashMap<>();

        public RemoteData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$triggerChange$0() {
            RemoteStore.this.f17102b.onNext(roj0.f160388a);
        }

        public void addOrUpdataAllData(List<? extends T> list, boolean z) {
            if (z) {
                clear();
                this.remoteData.clear();
                for (T t : this.localData.values()) {
                    this.remoteData.add(t);
                    put(t.f56011id, t);
                }
            }
            for (T t2 : list) {
                if (get(t2.f56011id) == null) {
                    this.remoteData.add(t2);
                    put(t2.f56011id, t2);
                    RemoteStore.this.f17101a = true;
                } else if (!get(t2.f56011id).equals(t2)) {
                    T t3 = get(t2.f56011id);
                    int iIndexOf = this.remoteData.indexOf(t3);
                    this.remoteData.remove(t3);
                    this.remoteData.add(iIndexOf, t2);
                    put(t2.f56011id, t2);
                    RemoteStore.this.f17101a = true;
                }
            }
        }

        public void addOrUpdateData(T t) {
            if (t.f56011id.startsWith("fake_id_")) {
                this.localData.put(t.f56011id, t);
            }
            if (get(t.f56011id) == null) {
                this.remoteData.add(0, t);
                put(t.f56011id, t);
                RemoteStore.this.f17101a = true;
            } else {
                if (get(t.f56011id).equals(t)) {
                    return;
                }
                T t2 = get(t.f56011id);
                int iIndexOf = this.remoteData.indexOf(t2);
                this.remoteData.remove(t2);
                this.remoteData.add(iIndexOf, t);
                put(t.f56011id, t);
                RemoteStore.this.f17101a = true;
            }
        }

        public boolean hasMore() {
            Links links = this.links;
            return links == null || !TextUtils.isEmpty(links.next);
        }

        public String next() {
            Links links = this.links;
            return links != null ? links.next : "";
        }

        public String previous() {
            Links links = this.links;
            return links != null ? links.previous : "";
        }

        public void removeData(T t) {
            if (t.f56011id.startsWith("fake_id_")) {
                this.localData.remove(t.f56011id);
            }
            T t2 = get(t.f56011id);
            if (t2 == null || !this.remoteData.remove(t2)) {
                return;
            }
            remove(t.f56011id);
            RemoteStore.this.f17101a = true;
        }

        public void removeDatas(List<T> list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                removeData(it.next());
            }
        }

        public void triggerChange() {
            e51.m114748M(new Runnable() { // from class: l.uqc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177736a.lambda$triggerChange$0();
                }
            });
        }

        public void updateLinks(Links links) {
            this.links = links;
            RemoteStore.this.f17101a = true;
        }

        public void addOrUpdataAllData(List<? extends T> list) {
            addOrUpdataAllData(list, false);
        }
    }
}
