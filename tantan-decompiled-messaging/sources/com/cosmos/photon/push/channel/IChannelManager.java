package com.cosmos.photon.push.channel;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public interface IChannelManager {

    public interface ChannelListener {
        IChannel getChannel();

        void onChannelConnected(IChannel iChannel);

        void onChannelDisConnect();

        void onChannelError(int i);
    }

    public interface IChannel {
        Bundle executeAction(Bundle bundle, String str);
    }

    void bind(String str, String str2, String str3, String str4, ChannelListener channelListener);

    void create(String str, String str2, String str3, ChannelListener channelListener);

    String query(String str);

    void release(String str);

    void unBind();
}
