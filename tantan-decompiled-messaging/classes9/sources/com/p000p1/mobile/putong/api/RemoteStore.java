package com.p000p1.mobile.putong.api;

import android.text.TextUtils;
import com.p1.mobile.putong.data.Links;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l.e51;
import l.roj0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class RemoteStore {

    /* JADX INFO: renamed from: a */
    public boolean f1090a = false;

    /* JADX INFO: renamed from: b */
    public a<roj0> f1091b = a.b();

    public class RemoteData<T extends DbObject> extends HashMap<String, T> {
        public Links links;
        public List<T> remoteData = new ArrayList();
        private LinkedHashMap<String, T> localData = new LinkedHashMap<>();

        public RemoteData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$triggerChange$0() {
            RemoteStore.this.f1091b.onNext(roj0.a);
        }

        public void addOrUpdataAllData(List<? extends T> list, boolean z) {
            if (z) {
                clear();
                this.remoteData.clear();
                for (T t : this.localData.values()) {
                    this.remoteData.add(t);
                    put(((DbObject) t).id, t);
                }
            }
            for (T t2 : list) {
                if (get(((DbObject) t2).id) == null) {
                    this.remoteData.add(t2);
                    put(((DbObject) t2).id, t2);
                    RemoteStore.this.f1090a = true;
                } else if (!get(((DbObject) t2).id).equals(t2)) {
                    T t3 = get(((DbObject) t2).id);
                    int iIndexOf = this.remoteData.indexOf(t3);
                    this.remoteData.remove(t3);
                    this.remoteData.add(iIndexOf, t2);
                    put(((DbObject) t2).id, t2);
                    RemoteStore.this.f1090a = true;
                }
            }
        }

        public void addOrUpdateData(T t) {
            if (((DbObject) t).id.startsWith("fake_id_")) {
                this.localData.put(((DbObject) t).id, t);
            }
            if (get(((DbObject) t).id) == null) {
                this.remoteData.add(0, t);
                put(((DbObject) t).id, t);
                RemoteStore.this.f1090a = true;
            } else {
                if (get(((DbObject) t).id).equals(t)) {
                    return;
                }
                T t2 = get(((DbObject) t).id);
                int iIndexOf = this.remoteData.indexOf(t2);
                this.remoteData.remove(t2);
                this.remoteData.add(iIndexOf, t);
                put(((DbObject) t).id, t);
                RemoteStore.this.f1090a = true;
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
            if (((DbObject) t).id.startsWith("fake_id_")) {
                this.localData.remove(((DbObject) t).id);
            }
            T t2 = get(((DbObject) t).id);
            if (t2 == null || !this.remoteData.remove(t2)) {
                return;
            }
            remove(((DbObject) t).id);
            RemoteStore.this.f1090a = true;
        }

        public void removeDatas(List<T> list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                removeData(it.next());
            }
        }

        public void triggerChange() {
            e51.M(new Runnable() { // from class: l.uqc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23708a.lambda$triggerChange$0();
                }
            });
        }

        public void updateLinks(Links links) {
            this.links = links;
            RemoteStore.this.f1090a = true;
        }

        public void addOrUpdataAllData(List<? extends T> list) {
            addOrUpdataAllData(list, false);
        }
    }
}
