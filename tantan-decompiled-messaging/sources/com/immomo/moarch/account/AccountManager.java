package com.immomo.moarch.account;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.ig3;

/* JADX INFO: loaded from: classes7.dex */
public class AccountManager {

    /* JADX INFO: renamed from: com.immomo.moarch.account.AccountManager$1 */
    class C38051 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (Process.myUid() == intent.getIntExtra("KEY_FROM_UID", -999) && Process.myPid() != intent.getIntExtra("KEY_FROM_PID", -999)) {
                intent.setExtrasClassLoader(AccountUser.class.getClassLoader());
                AccountManager.m18449a(null, intent.getIntExtra("KEY_EVENT", -999), intent.getExtras(), true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18449a(AccountManager accountManager, int i, Bundle bundle, boolean z) {
        throw null;
    }

    public static final class UserCache extends ArrayList<AccountUser> implements Serializable {
        private Map<String, AccountUser> accountUserMap;

        private UserCache() {
            this.accountUserMap = new ConcurrentHashMap();
        }

        private void addCache(AccountUser accountUser) {
            this.accountUserMap.put(accountUser.getId(), accountUser);
            if (accountUser.getAccountName() != null) {
                this.accountUserMap.put(accountUser.getAccountName(), accountUser);
            }
        }

        private void delCache(AccountUser accountUser) {
            this.accountUserMap.remove(accountUser.getId());
            if (accountUser.getAccountName() != null) {
                this.accountUserMap.remove(accountUser.getAccountName());
            }
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(AccountUser accountUser) {
            if (accountUser != null) {
                addCache(accountUser);
                return super.add(accountUser);
            }
            ig3.m135964a("accountUser is null");
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends AccountUser> collection) {
            throw new UnsupportedOperationException();
        }

        public AccountUser getUser(String str) {
            return this.accountUserMap.get(str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public AccountUser remove(int i) {
            AccountUser accountUser = (AccountUser) super.remove(i);
            if (accountUser != null) {
                delCache(accountUser);
            }
            return accountUser;
        }

        public boolean removeByAccountName(String str) {
            AccountUser user = getUser(str);
            if (user != null) {
                delCache(user);
            }
            return super.remove(user);
        }

        public void reset() {
            clear();
            this.accountUserMap.clear();
        }

        public /* synthetic */ UserCache(C38051 c38051) {
            this();
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public void add(int i, AccountUser accountUser) {
            if (accountUser == null) {
                throw new IllegalArgumentException("accountUser is null");
            }
            throw new UnsupportedOperationException();
        }
    }
}
