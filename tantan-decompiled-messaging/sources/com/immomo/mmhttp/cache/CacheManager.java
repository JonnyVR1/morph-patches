package com.immomo.mmhttp.cache;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public enum CacheManager {
    INSTANCE;

    private Lock mLock = new ReentrantLock();
    private C3792a<Object> cacheDao = new C3792a<>();

    CacheManager() {
    }

    public boolean clear() {
        this.mLock.lock();
        try {
            return this.cacheDao.m109973c() > 0;
        } finally {
            this.mLock.unlock();
        }
    }

    public CacheEntity<Object> get(String str) {
        this.mLock.lock();
        try {
            return this.cacheDao.m18400m(str);
        } finally {
            this.mLock.unlock();
        }
    }

    public List<CacheEntity<Object>> getAll() {
        this.mLock.lock();
        try {
            return this.cacheDao.m109976f();
        } finally {
            this.mLock.unlock();
        }
    }

    public boolean remove(String str) {
        if (str == null) {
            return true;
        }
        this.mLock.lock();
        try {
            return this.cacheDao.m18403p(str);
        } finally {
            this.mLock.unlock();
        }
    }

    public CacheEntity<Object> replace(String str, CacheEntity<Object> cacheEntity) {
        this.mLock.lock();
        try {
            cacheEntity.setKey(str);
            this.cacheDao.m109979l(cacheEntity);
            return cacheEntity;
        } finally {
            this.mLock.unlock();
        }
    }
}
