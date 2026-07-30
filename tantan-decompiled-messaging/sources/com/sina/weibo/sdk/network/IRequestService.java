package com.sina.weibo.sdk.network;

import com.sina.weibo.sdk.network.base.RequestResult;
import com.sina.weibo.sdk.network.exception.RequestException;
import com.sina.weibo.sdk.network.target.Target;

/* JADX INFO: loaded from: classes11.dex */
public interface IRequestService {
    <T> RequestCancelable asyncRequest(IRequestParam iRequestParam, Target<T> target);

    RequestResult request(IRequestParam iRequestParam) throws RequestException;

    <T> T request(IRequestParam iRequestParam, Class<T> cls) throws RequestException;
}
