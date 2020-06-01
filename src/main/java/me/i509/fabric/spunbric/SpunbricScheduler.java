/*
 * The MIT License (MIT)
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) i509VCB <git@i509.me>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package me.i509.fabric.spunbric;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.scheduler.ScheduledTask;
import org.spongepowered.api.scheduler.Scheduler;
import org.spongepowered.api.scheduler.Task;
import org.spongepowered.api.scheduler.TaskExecutorService;

public class SpunbricScheduler implements Scheduler {
    @Override
    public Optional<ScheduledTask> getTaskById(UUID id) {
        throw new AssertionError("Implement Me");
    }

    @Override
    public Set<ScheduledTask> getTasksByName(String pattern) {
        throw new AssertionError("Implement Me");
    }

    @Override
    public Set<ScheduledTask> getTasks() {
        throw new AssertionError("Implement Me");
    }

    @Override
    public Set<ScheduledTask> getTasksByPlugin(PluginContainer plugin) {
        throw new AssertionError("Implement Me");
    }

    @Override
    public TaskExecutorService createExecutor(PluginContainer plugin) {
        throw new AssertionError("Implement Me");
    }

    @Override
    public ScheduledTask submit(Task task) {
        throw new AssertionError("Implement Me");
    }
}